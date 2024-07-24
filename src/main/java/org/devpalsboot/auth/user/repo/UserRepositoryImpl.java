package org.devpalsboot.auth.user.repo;

import lombok.RequiredArgsConstructor;
import org.devpalsboot.auth.common.config.mapstruct.impl.UserDomainEntityMapper;
import org.devpalsboot.auth.user.domain.UserDomain;
import org.devpalsboot.auth.user.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final UserJpaRepository userJpaRepository;
    private final UserDomainEntityMapper userDomainEntityMapper;

    @Override
    public Optional<UserDomain> findById(Long id) {
        return userJpaRepository.findById(id).map(userDomainEntityMapper::toDomain);
    }

    @Override
    public UserDomain save(UserDomain user) {
        UserEntity userEntity = userDomainEntityMapper.toEntity(user);
        return userDomainEntityMapper.toDomain(userJpaRepository.save(userEntity));
    }
}
