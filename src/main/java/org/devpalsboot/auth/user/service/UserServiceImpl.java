package org.devpalsboot.auth.user.service;

import lombok.RequiredArgsConstructor;
import org.devpalsboot.auth.common.config.mapstruct.impl.UserDomainDtoMapper;
import org.devpalsboot.auth.common.config.mapstruct.impl.UserEntityDtoMapper;
import org.devpalsboot.auth.common.infrastructure.UserPasswordEncoder;
import org.devpalsboot.auth.user.domain.UserDomain;
import org.devpalsboot.auth.user.domain.UserCreate;
import org.devpalsboot.auth.user.dto.UserDto;
import org.devpalsboot.auth.user.entity.UserEntity;
import org.devpalsboot.auth.user.repo.UserRepository;
import org.springframework.stereotype.Service;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final UserDomainDtoMapper userDomainMapper;
    public UserDto create(UserCreate userCreate) {
        UserDomain user = new UserDomain();
        UserPasswordEncoder userPasswordEncoder = new UserPasswordEncoder();
        UserDomain userDomain = user.createUser(userCreate, userPasswordEncoder);
        UserDomain savedDomain = userRepository.save(userDomain);
        return userDomainMapper.toDto(savedDomain);
    }
}
