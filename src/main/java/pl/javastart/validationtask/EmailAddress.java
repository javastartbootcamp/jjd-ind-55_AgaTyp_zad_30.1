package pl.javastart.validationtask;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = EmailValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface EmailAddress {
    String message() default "{pl.javastart.validationtask.constraint.EmailAddress.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String regexpPattern();
}
