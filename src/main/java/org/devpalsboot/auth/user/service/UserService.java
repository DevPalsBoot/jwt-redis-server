package org.devpalsboot.auth.user.service;

import lombok.RequiredArgsConstructor;
import org.devpalsboot.auth.common.config.mapstruct.impl.UserDomainDomainMapper;
import org.devpalsboot.auth.common.infrastructure.UserPasswordEncoder;
import org.devpalsboot.auth.user.domain.User;
import org.devpalsboot.auth.user.domain.UserCreate;
import org.devpalsboot.auth.user.dto.UserDto;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserDomainDomainMapper userDomainMapper;
    public UserDto create(UserCreate userCreate) {
        User user = new User();
        UserPasswordEncoder userPasswordEncoder = new UserPasswordEncoder();
        User userDomain = user.createUser(userCreate, userPasswordEncoder);
        return userDomainMapper.toDto(userDomain);
    }
}
