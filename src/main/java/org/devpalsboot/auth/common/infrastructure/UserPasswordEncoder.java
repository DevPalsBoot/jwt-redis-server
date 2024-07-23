package org.devpalsboot.auth.common.infrastructure;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Password encoder in order to secure user's password
 */
public class UserPasswordEncoder implements PasswordEncoder {

    /** SHA strength */
    private static final Integer SHA_STRENGTH = 512;
    /** Salt to be used */
    private static final Object SALT = "b2488173aa76395d460a5f3d309d1a340a019d02e157436dcc89f4e7dd48e503";

    /** Password encoder with SHA */
    private final ShaPasswordEncoder shaPasswordEncoder;
    /** Bcrypt password encoder */
    private final PasswordEncoder bcryptPasswordEncoder;

    public UserPasswordEncoder() {
        this.shaPasswordEncoder = new ShaPasswordEncoder(SHA_STRENGTH);
        this.bcryptPasswordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public String encode(CharSequence charSequence) {
        return this.bcryptPasswordEncoder.encode(getShaEncoded(charSequence));
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return bcryptPasswordEncoder.matches(getShaEncoded(charSequence), s);
    }

    /**
     * Get an encoded result by SHA encoder
     * @param raw a raw character sequence
     * @return an encoded result
     */
    private String getShaEncoded(CharSequence raw) {
        return raw != null ? this.shaPasswordEncoder.encodePassword(raw.toString(), SALT) : null;
    }

}
