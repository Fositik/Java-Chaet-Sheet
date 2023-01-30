package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Добавьте обработку LimitException в методе main().
 * При превышении лимита попыток предусмотрите вывод сообщения: Превышен лимит ошибок ввода: n,
 * где n — количество реальных попыток.
 */
public class FinancialCalculatorException {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            calculate();

        } catch (LimitException exp) {
            System.out.println(exp.getDetailMessage());
        }
        // перехват исключения LimitException
    }

    public static double getInterest(final double rate, final int time, final double principal) {
        final double multiplier = Math.pow(1.0 + rate / 100.0, time) - 1.0;
        return multiplier * principal;
    }

    public static int getIntLimited(String greeting, int attempts) {
        for (int counter = 0; counter < attempts; counter++) {
            try {
                System.out.println(greeting + " => ");
                try {
                    final int value = scanner.nextInt();
                    // проверка на отрицательное значение
                    if (value < 0) {
                        // сгенерируйте исключение "Введено отрицательное значение"
                        throw new InputException("Ошибка ввода: введено отрицательное значение");
                    }

                    return value;
                } catch (InputMismatchException exception) {
                    System.out.println("Введено не число");
                }
            } catch (InputException exception) {
                // сгенерируйте вывод формата "Ошибка ввода: " + информация об исключении
                System.out.print("Ошибка ввода: " + exception.getMessage());
            }
        }
        // сгенерируйте исключение LimitException с сообщением "Превышен лимит ошибок ввода"
        throw new LimitException("Превышен лимит ошибок ввода",attempts);
    }

    public static double getDoubleLimited(String greeting, int attempts) {
        for (int counter = 0; counter < attempts; counter++) {
            try {
                System.out.println(greeting + " => ");
                // добавьте недостающий код
                try {
                    final double value = scanner.nextDouble();
                    if (value < 0)
                        throw new InputException("Ошибка ввода: введено отрицательное значение");

                    return value;
                } catch (InputMismatchException exception) {
                    System.out.println("Введено не число");
                }
            } catch (InputException exception) {
                System.out.print(exception.getMessage());
            }
        }
        // сгенерируйте исключение LimitException
        throw new LimitException("Превышен лимит ошибок ввода",attempts);
    }

    public static void calculate() {
        final double rate = getDoubleLimited("Введите ставку", 3);
        final double principal = getDoubleLimited("Введите размер вклада", 3);
        final int time = getIntLimited("Введите срок вклада в месяцах", 5);
        System.out.println("Ваша выгода = " + getInterest(rate, time, principal));
    }
}

/**
 * Проверьте, что конструкторы классов-исключений позволяют принимать заданные параметры —
 * сообщение об исключении и количество попыток.
 * <p>
 * Обработайте непроверяемое исключение LimitException в методе main().
 * Убедитесь, что в методах getDoubleLimited() и getIntLimited() добавлена генерация нужных исключений.
 */
class InputException extends Exception {
    /**
     * При обработке ошибки предусмотрите вывод для пользователей следующих сообщений:
     * Введено отрицательное значение;
     * Введено не число;
     * Ошибка ввода: <подробное сообщение об ошибке>.
     */
    public InputException(final String message) {
        super(message);
    }
}

class LimitException extends RuntimeException {
    /**
     * Помимо текста исключения оно должно принимать количество попыток ввода attempts в виде целого числа.
     */
private final int attempts;

    public LimitException(final String message,final int attempts) {
        super(message);
        this.attempts = attempts;
    }

    public String getDetailMessage(){
        return getMessage()+", "+attempts;
    }


}

