package org.devpalsboot.auth.token;

import org.devpalsboot.auth.token.domain.Token;
import org.devpalsboot.auth.user.domain.User;

public interface TokenService {

    Token create(User user);

    Token reissueToken(String email, String newAccessToken);
}
