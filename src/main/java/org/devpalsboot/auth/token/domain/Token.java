package org.devpalsboot.auth.token.domain;

import java.util.Date;

import org.devpalsboot.auth.user.domain.User;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Token {
    private String accessToken;
    private String refreshToken;
    private User user;
    private Date refreshTokenExpiryTime;

    @Builder
    public Token(String accessToken, String refreshToken, User user, Date refreshTokenExpiryTime) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.user = user;
        this.refreshTokenExpiryTime = refreshTokenExpiryTime;
    }

    /**
     * token 발급
     */
    public void createToken() {
        throw new RuntimeException("failed to create token");
    }

    /**
     * access token 재발급
     *
     * @param newAccessToken
     */
    public void reissueAccessToken(String newAccessToken) {
        throw new RuntimeException("failed to reissue access token.");
    }
}
