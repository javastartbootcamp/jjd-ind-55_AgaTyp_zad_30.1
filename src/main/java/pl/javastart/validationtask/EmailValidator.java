package pl.javastart.validationtask;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements ConstraintValidator<EmailAddress, String> {
    private String regexpPattern;

    @Override
    public void initialize(EmailAddress constraintAnnotation) {
        regexpPattern = constraintAnnotation.regexpPattern();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return checkEmail(value);
    }

    private boolean checkEmail(String emailProvided) {
        Pattern pattern = Pattern.compile(regexpPattern);
        Matcher matcher = pattern.matcher(emailProvided);
        return matcher.find();
    }
}
