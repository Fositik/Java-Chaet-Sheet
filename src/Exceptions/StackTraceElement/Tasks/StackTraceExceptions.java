/**
package Exceptions.StackTraceElement.Tasks;

import java.util.Scanner;

public class StackTraceExceptions {
    public static void main(String[] args) {
        System.out.print("Введите целое число => ");
        Scanner scanner = new Scanner(System.in);
        final String inputValue = scanner.next();
        try {
            final int parsedValue = IntegerParser.parseInt(inputValue);
            System.out.println(parsedValue);
        } catch (NullStringException | EmptyStringException exception) {
            printException("Введена пустая строка.", exception);
            if (exception!=null){
               exception.getMessage();
            } else {
                exception.printStackTrace();
            }
        } catch (StringNotNumberException exception) {
            printException("Вы ввели не целое число.", exception);
            if (exception!=null){
               exception.getMessage();
            } else {
                exception.printStackTrace();
            }
        } catch (StringIsTooBigNumberException exception) {
            printException("Введённое число слишком большое.", exception);
            if (exception!=null){
                System.out.println(exception.getMessage());
            } else {
                exception.printStackTrace();
            }
        } catch (StringIsTooSmallNumberException exception) {
            printException("Введённое число слишком маленькое.", exception);
            if (exception!=null){
                System.out.println(exception.getMessage());
            } else {
                exception.printStackTrace();
            }
        }
    }

    private static void printException(final String message, final Throwable throwable) {
        System.out.println(message);
    }
}*/
