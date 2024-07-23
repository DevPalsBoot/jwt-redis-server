package org.devpalsboot.auth.token.domain;

import java.util.Date;

import org.devpalsboot.auth.user.domain.User;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class TokenTest {

    @Test
    public void accessToken을_재발급_할_수_있다() {
        //given
        User user = new User();
        user.setEmail("test@sparrow.im");
        user.setPassword("password");

        Token token = Token.builder()
                .user(user)
                .accessToken("access-token")
                .refreshToken("refresh-token")
                .build();
        String newAccessToken = "new-access-token";

        // when
        token = token.reissueAccessToken(newAccessToken);

        // then
        assertThat(token.getUser().getEmail()).isEqualTo("test@sparrow.im");
        assertThat(token.getUser().getPassword()).isEqualTo("password");
        assertThat(token.getAccessToken()).isEqualTo(newAccessToken);
        assertThat(token.getRefreshToken()).isEqualTo("refresh-token");

    }

}