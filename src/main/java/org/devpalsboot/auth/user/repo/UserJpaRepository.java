package org.devpalsboot.auth.user.repo;

import org.devpalsboot.auth.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {
}
