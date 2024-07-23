package org.devpalsboot.auth.token.domain;

import org.devpalsboot.auth.user.domain.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class TokenTest {

    @Test
    public void createTest() {
        User user = new User();
        user.setEmail("email@google.com");
        user.setPassword("password");
        Token token = Token.builder()
                .user(user)
                .build();

        token.create();

        assertNotNull(token.getAccessToken());
        assertNotNull(token.getRefreshToken());
        assertNotNull(token.getRefreshTokenExpiryTime());
    }

}