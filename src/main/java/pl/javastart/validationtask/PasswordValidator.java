package pl.javastart.validationtask;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator implements ConstraintValidator<Password, String> {
    private String regexpPattern;

    @Override
    public void initialize(Password constraintAnnotation) {
        regexpPattern = constraintAnnotation.regexpPattern();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return checkPassword(value);
    }

    private boolean checkPassword(String passwordProvided) {
        Pattern pattern = Pattern.compile(regexpPattern);
        Matcher matcher = pattern.matcher(passwordProvided);
        return matcher.find();
    }
}
