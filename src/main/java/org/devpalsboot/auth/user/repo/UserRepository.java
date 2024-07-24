package org.devpalsboot.auth.user.repo;

import org.devpalsboot.auth.user.entity.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(Long id);
}
