package org.devpalsboot.auth.user.domain;

import org.devpalsboot.auth.mock.TestUserPasswordEncoder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    @Test
    @DisplayName("사용자 생성")
    public void create_user_test() {
        // given
        UserCreate userCreate = new UserCreate("test@gmail.com", "a1234567!");
        User user = new User();
        TestUserPasswordEncoder testUserPasswordEncoder = new TestUserPasswordEncoder("encodedPassword");
        // when
        User createdUser = user.createUser(userCreate, testUserPasswordEncoder);
        // then
        assertThat(createdUser.getEncryptPassword()).isEqualTo("encodedPassword");
    }
}