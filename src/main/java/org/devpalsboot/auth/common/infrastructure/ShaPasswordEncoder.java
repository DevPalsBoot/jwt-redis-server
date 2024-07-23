package org.devpalsboot.auth.common.infrastructure;

import org.springframework.security.crypto.codec.Hex;
import org.springframework.security.crypto.codec.Utf8;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ShaPasswordEncoder {

    private final String algorithm;

    public ShaPasswordEncoder(int strength) {
        this.algorithm = "SHA-" + strength;
    }

    public String encodePassword(String rawPass, Object salt) {
        MessageDigest messageDigest = getMessageDigest();
        byte[] input = this.mergePasswordAndSalt(rawPass, salt);
        char[] encoded = Hex.encode(messageDigest.digest(input));
        return new String(encoded);
    }

    private MessageDigest getMessageDigest() {
        try {
            return MessageDigest.getInstance(this.algorithm);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException("No such algorithm [" + this.algorithm + "]");
        }
    }

    private byte[] mergePasswordAndSalt(String rawPass, Object salt) {
        return Utf8.encode(rawPass + "{" + salt + "}");
    }

}
