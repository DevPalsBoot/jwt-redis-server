package org.devpalsboot.auth.domain;

import org.devpalsboot.auth.user.domain.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    @Test
    @DisplayName("로그인에 성공한다.")
    public void login_test() {
        User user = new User();
        user.login();
        assertThat(user.getLoginDateTime()).isEqualTo("What..?");
    }

}