package org.dummy.brms.dummy_brms.mybatis.ext;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.dummy.brms.dummy_brms.mybatis.pojo.Users;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;

@Mapper
public interface UsersExtMapper extends CommonInsertMapper<Users> {

    @Insert("INSERT INTO dumb_brms.users (id, username, psw_hash, email, flg_deleted) VALUES (DEFAULT, #{username}, #{pswHash}, #{email}, FALSE")
    int insertUser(Users user);

}
