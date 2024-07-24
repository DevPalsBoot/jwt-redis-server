package org.devpalsboot.auth.token;

import org.devpalsboot.auth.token.domain.Token;
import org.devpalsboot.auth.user.domain.UserDomain;

public interface TokenService {

    Token create(UserDomain user);

    Token reissueToken(String email, String newAccessToken);
}
