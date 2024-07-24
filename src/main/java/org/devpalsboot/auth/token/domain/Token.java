package org.devpalsboot.auth.token.domain;

import java.util.Date;

import org.devpalsboot.auth.user.domain.UserDomain;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Token {
    private final UserDomain user;
    private final String accessToken;
    private final String refreshToken;
    private final Date refreshTokenExpiryTime;

    @Builder
    public Token(UserDomain user, String accessToken, String refreshToken, Date refreshTokenExpiryTime) {
        this.user = user;
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.refreshTokenExpiryTime = refreshTokenExpiryTime;
    }


    /**
     * access token 재발급
     */
    public Token reissueAccessToken(String newAccessToken) {
        return Token.builder()
                .user(user)
                .accessToken(newAccessToken)
                .refreshToken(refreshToken)
                .refreshTokenExpiryTime(refreshTokenExpiryTime)
                .build();
    }
}
