package String.StringFormating.Tasks;

import java.util.ArrayList;
import java.util.SplittableRandom;

public class CheckPrinter {
    public static void main(String[] args) {
        String[] items = {"Пицца, 1 шт., 310.50", "Чай, 2 шт., 113.30", "Печенье, 1 уп., 75.75"};
        CheckPrinter cp = new CheckPrinter();
        cp.printCheck(items);
    }

    public void printCheck(String[] items) {
        for (String item : items) {
            String[] splitedItem = item.split(", ");
            System.out.printf("%-8s%7s%10s%n", splitedItem[0], splitedItem[1], splitedItem[2]);
        }
    }
}
/**
 * {"Пицца, 1 шт., 310.50", "Чай, 2 шт., 113.30", "Печенье, 1 уп., 75.75"}.
 * <p>
 * Пицца,    1 шт.,  310.50
 * Чай,      2 шт.,  113.30
 * Печенье,  1 уп.,  75.75
 * <p>
 * Пицца,       1 шт.,     310.50
 * Чай,         2 шт.,     113.30
 * Печенье,     1 уп.,     75.75
 */