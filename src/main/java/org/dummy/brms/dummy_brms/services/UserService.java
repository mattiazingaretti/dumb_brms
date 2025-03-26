package org.dummy.brms.dummy_brms.services;

import org.dummy.brms.dummy_brms.exception.DummyNotFoundException;
import org.dummy.brms.dummy_brms.model.dto.PostedResourceDTO;
import org.dummy.brms.dummy_brms.model.dto.SignupRequestDTO;
import org.dummy.brms.dummy_brms.model.dto.UserDTO;

public interface UserService {


    UserDTO getUserWithRoleById(Long id) throws DummyNotFoundException;

    UserDTO getUserWithRoleByEmail(String email);

    UserDTO getUserByEmail(String email) throws DummyNotFoundException;

    PostedResourceDTO saveUser(SignupRequestDTO signupDto) throws DummyNotFoundException;
}
