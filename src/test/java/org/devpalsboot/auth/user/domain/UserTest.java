package org.devpalsboot.auth.user.domain;

import org.devpalsboot.auth.mock.TestClockHolder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {
    @Test
    @DisplayName("로그인에 성공한다.")
    public void login_test() {
        User user = new User();
        TestClockHolder testClockHolder = new TestClockHolder(123456789L);
        user.login(testClockHolder);
        assertThat(user.getLoginDateTime()).isEqualTo(123456789L);
    }
}