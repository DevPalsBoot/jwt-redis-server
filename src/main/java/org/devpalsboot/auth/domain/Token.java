package org.devpalsboot.auth.domain;

public class Token {
    private User user;
    private String accessToken;
    private String refreshToken;

    public Token createToken(User user) {
        // 새 토큰을 생성한다
        return null;
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
