package org.devpalsboot.auth.user.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.devpalsboot.auth.common.validator.annotation.NoWhitespace;

@Getter
@RequiredArgsConstructor
@Builder
public class UserCreate {
    private final String email;

    @NotBlank(message = "Password cannot be empty")
    @Size(min = 8, max = 32, message = "Password must be between 8 and 32 characters")
    @NoWhitespace(message = "Password cannot contain whitespace")
    private final String password;
}
