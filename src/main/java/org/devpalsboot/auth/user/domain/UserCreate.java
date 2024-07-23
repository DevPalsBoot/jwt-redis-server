package org.devpalsboot.auth.user.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Builder
public class UserCreate {
    private final String email;
    private final String password;
}
