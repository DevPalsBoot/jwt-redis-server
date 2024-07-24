package org.devpalsboot.auth.user.repo;

import org.devpalsboot.auth.user.domain.UserDomain;
import org.devpalsboot.auth.user.entity.UserEntity;

import java.util.Optional;

public interface UserRepository {
    Optional<UserDomain> findById(Long id);
    UserDomain save(UserDomain user);
}
