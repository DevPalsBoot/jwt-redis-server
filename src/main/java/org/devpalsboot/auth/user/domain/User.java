package org.devpalsboot.auth.user.domain;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String email;
    private String password;
    private Date loginDateTime;

    /**
     * 로그인
     */
//    public void login(ClockHolder clockHolder) {
//
//    }
}
