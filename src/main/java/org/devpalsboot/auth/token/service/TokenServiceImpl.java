package org.devpalsboot.auth.token.service;

import java.util.Date;

import org.devpalsboot.auth.token.TokenService;
import org.devpalsboot.auth.token.domain.Token;
import org.devpalsboot.auth.user.domain.UserDomain;

public class TokenServiceImpl implements TokenService {

    public Token getByUserEmail(String email) {
        // tokenRepository.findByUserEmail(email)
        return null;
    }

    @Override
    public Token create(UserDomain user) {
        Token token = Token.builder()
                .user(user)
                .accessToken(generateAccessToken())
                .refreshToken(generateRefreshToken())
                .refreshTokenExpiryTime(calcExpiryTime())
                .build();

        // 레디스에 토큰 저장 로직 추가
        return token;
    }

    @Override
    public Token reissueToken(String email, String newAccessToken) {
        Token token = getByUserEmail(email);
        return token.reissueAccessToken(newAccessToken);
    }

    private String generateAccessToken() {
        return "generated-access-token";
    }

    private String generateRefreshToken() {
        return "generated-refresh-token";
    }

    private Date calcExpiryTime() {
        // expire time : 1D
        return new Date(System.currentTimeMillis() + 86400000);
    }
}
