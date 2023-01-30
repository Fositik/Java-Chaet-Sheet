package Exceptions.Throws.Task2.validators;

import Exceptions.Throws.Task2.exceptions.ValidateException;
import Exceptions.Throws.Task2.exceptions.ValidatePasswordException;
import Exceptions.Throws.Task2.exceptions.Validator;

public class PasswordLengthValidator implements Validator {
    private final int minLength;

    public PasswordLengthValidator(final int minLength) {
        this.minLength = minLength;
    }

    @Override
    public void validate(final String password) throws ValidateException {
        if (password == null || password.length() < minLength) {
            throw new ValidatePasswordException(
                    String.format("Пароль должен быть больше %d символов", minLength)
            );
        }
    }
}