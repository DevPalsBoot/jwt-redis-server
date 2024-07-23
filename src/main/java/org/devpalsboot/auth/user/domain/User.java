package org.devpalsboot.auth.user.domain;

import lombok.Data;
import org.devpalsboot.auth.common.service.ClockHolder;

@Data
public class User {
    private String email;
    private String password;
    private Long loginDateTime;

    /**
     * 로그인
     */
    public void login(ClockHolder clockHolder) {
        this.loginDateTime = clockHolder.millis();
    }
}
