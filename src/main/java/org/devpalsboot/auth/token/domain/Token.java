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
    public Token(User user) {
        this.user = user;
    }

    /**
     * token 발급
     */
    public void create() {
        this.accessToken = generateAccessToken();
        this.refreshToken = generateRefreshToken();
        this.refreshTokenExpiryTime = calExpiryTime();
    }

    private String generateAccessToken() {
        return "generated-access-token";
    }

    private String generateRefreshToken() {
        return "generated-refresh-token";
    }

    private Date calExpiryTime() {
        // expire time : 1D
        return new Date(System.currentTimeMillis() + 86400000);
    }

    /**
     * access token 재발급
     */
    public void reissueAccessToken(String newAccessToken) {
    }
}
