package pl.javastart.validationtask;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PasswordValidator.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Password {
//    String message() default "${validatedValue} is incorrect. It should contain 1 special char, 1 uppercase and 1 lowercase letter";
    String message() default "{pl.javastart.validationtask.constraint.Password.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String regexpPattern();
}
