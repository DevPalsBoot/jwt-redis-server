package org.devpalsboot.auth.user.service;

import org.devpalsboot.auth.user.domain.UserCreate;
import org.devpalsboot.auth.user.dto.UserDto;

public interface UserService {

    UserDto create(UserCreate userCreate);

}
