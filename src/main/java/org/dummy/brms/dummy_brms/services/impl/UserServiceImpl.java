package org.dummy.brms.dummy_brms.services.impl;


import lombok.extern.slf4j.Slf4j;
import org.dummy.brms.dummy_brms.Constants;
import org.dummy.brms.dummy_brms.exception.DummyNotFoundException;
import org.dummy.brms.dummy_brms.exception.ErrorCode;
import org.dummy.brms.dummy_brms.model.dto.PostedResourceDTO;
import org.dummy.brms.dummy_brms.model.dto.RolesDTO;
import org.dummy.brms.dummy_brms.model.dto.SignupRequestDTO;
import org.dummy.brms.dummy_brms.model.dto.UserDTO;
import org.dummy.brms.dummy_brms.mybatis.ext.UsersExtMapper;
import org.dummy.brms.dummy_brms.mybatis.mappers.RolesMapper;
import org.dummy.brms.dummy_brms.mybatis.mappers.UserRolesMapper;
import org.dummy.brms.dummy_brms.mybatis.mappers.VUsersDynamicSqlSupport;
import org.dummy.brms.dummy_brms.mybatis.mappers.VUsersMapper;
import org.dummy.brms.dummy_brms.mybatis.pojo.UserRoles;
import org.dummy.brms.dummy_brms.mybatis.pojo.Users;
import org.dummy.brms.dummy_brms.mybatis.pojo.VUsers;
import org.dummy.brms.dummy_brms.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Service
@Slf4j
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    VUsersMapper vUsersMapper;
    @Autowired
    UsersExtMapper usersExtMapper;

    @Autowired
    UserRolesMapper userRolesMapper;


    @Autowired
    @Lazy
    PasswordEncoder encoder;

    @Override
    public UserDTO getUserById(Long id) throws DummyNotFoundException {
        List<VUsers> vuser = vUsersMapper.select(selDsl -> selDsl.where(VUsersDynamicSqlSupport.id, isEqualTo(id))).stream().toList();
        if(vuser == null || vuser.isEmpty())
            throw new DummyNotFoundException(ErrorCode.NOT_FOUND);

        UserDTO userDTO = new UserDTO(vuser.stream().map(v_user-> new RolesDTO(v_user.getUserRole())).toList());
        userDTO.setId(vuser.get(0).getId());
        userDTO.setUsername(vuser.get(0).getUsername());
        userDTO.setEmail(vuser.get(0).getEmail());
        return userDTO;
    }

    @Override
    public UserDTO getUserByEmail(String email){
        List<VUsers> vuser = vUsersMapper.select(selDsl -> selDsl.where(VUsersDynamicSqlSupport.email, isEqualTo(email))).stream().toList();
        if(vuser == null || vuser.isEmpty())
            throw new UsernameNotFoundException("User Not Found with email: " + email);
        UserDTO userDTO = new UserDTO(vuser.stream().map(v_user-> new RolesDTO(v_user.getUserRole())).toList());
        userDTO.setId(vuser.get(0).getId());
        userDTO.setUsername(vuser.get(0).getUsername());
        userDTO.setEmail(vuser.get(0).getEmail());
        userDTO.setPassword(vuser.get(0).getPswHash());
        return userDTO;
    }

    @Override
    public PostedResourceDTO saveUser(SignupRequestDTO signupDto) {
        try{
            getUserByEmail(signupDto.getEmail());
            return PostedResourceDTO.builder()
                    .success(false)
                    .msg("User already exists")
                    .build();
        }catch (UsernameNotFoundException e){
            log.info("User not found with email: " + signupDto.getEmail());
            Users usr = new Users();
            usr.setEmail(signupDto.getEmail());
            usr.setUsername(signupDto.getUsername());
            usr.setPswHash(encoder.encode(signupDto.getPassword()));
            usersExtMapper.insertUser(usr);

            // Add Basic user role
            UserDTO u = this.getUserByEmail(signupDto.getEmail());
            UserRoles r = new UserRoles();
            r.setUserRole(Constants.ROLE_USER);
            r.setUserId(u.getId());
            userRolesMapper.insert(r);
            return PostedResourceDTO.builder()
                    .success(true)
                    .msg("User registered successfully")
                    .build();
        }

    }


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return this.getUserByEmail(email);
    }

}
