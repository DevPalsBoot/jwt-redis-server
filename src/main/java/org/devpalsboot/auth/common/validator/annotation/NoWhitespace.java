package org.devpalsboot.auth.common.validator.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import org.devpalsboot.auth.common.validator.NoWhitespaceValidator;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = NoWhitespaceValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NoWhitespace {
    String message() default "공백을 사용할 수 없습니다.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}