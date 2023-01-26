package Exceptions;

public class PrintStackTrace {
    public static void main(String[] args) {
        try {
            calculate();
        } catch (ArithmeticException exception) {
            exception.printStackTrace(); // будет выведен стек-трейс ошибки
            /**
             * Теперь на экран будет выведена информация об обработанной ошибке.
             * Так исключение будет легче найти и исправить.
             */
        }
    }

    public static int calculate() {
        return 10 / 0;
    }
}