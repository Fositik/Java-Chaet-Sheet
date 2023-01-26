package Exceptions;

/**
 * Можно также получить в catch короткое сообщение с описанием ошибки, например, такое — / by zero.
 * Для этого понадобится другой метод Throwable — getMessage().
 */
public class GetMessage {
    public static void main(String[] args) {
        try {
            calculate();
        } catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static int calculate() {
        return 10 / 0;
    }
}