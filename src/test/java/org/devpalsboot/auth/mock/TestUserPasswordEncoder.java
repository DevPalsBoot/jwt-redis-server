package org.devpalsboot.auth.mock;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
@RequiredArgsConstructor
public class TestUserPasswordEncoder implements PasswordEncoder {

    private final String encodedPassword;
    @Override
    public String encode(CharSequence rawPassword) {
        return encodedPassword;
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return false;
    }
}
