package org.devpalsboot.auth.common.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.devpalsboot.auth.common.validator.annotation.NoWhitespace;

public class NoWhitespaceValidator implements ConstraintValidator<NoWhitespace, String> {
    @Override
    public void initialize(NoWhitespace constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value == null || !value.contains(" ");
    }
}
