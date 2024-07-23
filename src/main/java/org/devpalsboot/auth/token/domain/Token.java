package org.devpalsboot.auth.token.domain;

import org.devpalsboot.auth.user.domain.User;

import lombok.Builder;

public class Token {
    private String accessToken;
    private String refreshToken;

    @Builder
    public Token(String accessToken, String refreshToken) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
    }

    public void reissueAccessToken(String newAccessToken) throws IllegalAccessException {
        if (!isValidRefreshToken()) {
            throw new IllegalAccessException("the refresh token is not valid.");
        }
        this.accessToken = newAccessToken;
    }

    private boolean isValidRefreshToken() {
        // this.refreshToken 검증 로직
        return true;
    }
}
