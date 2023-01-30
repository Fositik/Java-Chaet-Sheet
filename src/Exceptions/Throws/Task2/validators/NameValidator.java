package Exceptions.Throws.Task2.validators;


import Exceptions.Throws.Task2.exceptions.ValidateException;
import Exceptions.Throws.Task2.exceptions.ValidateNameException;
import Exceptions.Throws.Task2.exceptions.Validator;

public class NameValidator implements Validator {
    // допишите код класса
    @Override
    public void validate(String value) throws ValidateException {
        try {
            if (value.isEmpty())
                throw new ValidateNameException("Имя не должно быть пустым");
        } catch (NullPointerException e){
            e.getMessage();
        }
    }
}