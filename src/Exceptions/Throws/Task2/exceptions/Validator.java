package Exceptions.Throws.Task2.exceptions;


public interface Validator {
    void validate(String value) throws ValidateException;
}