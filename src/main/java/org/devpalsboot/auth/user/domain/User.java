package org.devpalsboot.auth.user.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// 로그인은 시큐리티에서..
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String password;
    private String email;
    public User createUser(UserCreate userCreate) {
        // 이미 존재하는 비밀번호인지 확인
        return User.builder()
                .email(userCreate.getEmail())
                .password(userCreate.getPassword())
                .build();
    }
    public void logout() {
    }
    public void deleteUser() {
    }
}
