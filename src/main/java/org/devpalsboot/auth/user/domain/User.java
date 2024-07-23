package org.devpalsboot.auth.user.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.devpalsboot.auth.common.infrastructure.UserPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

// 로그인은 시큐리티에서..
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String password;
    private String email;
    private String encryptPassword;
    public User createUser(UserCreate userCreate, PasswordEncoder userPasswordEncoder) {
        return User.builder()
                .email(userCreate.getEmail())
                .password(userCreate.getPassword())
                .encryptPassword(userPasswordEncoder.encode(password))
                .build();
    }
    public void logout() {
    }
    public void deleteUser() {
    }
}
