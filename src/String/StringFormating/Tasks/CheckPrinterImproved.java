package String.StringFormating.Tasks;

import java.util.ArrayList;

public class CheckPrinterImproved {
    public static void main(String[] args) {
        String[] items = {"Пицца, 1 шт., 310.50", "Чай, 2 шт., 113.30", "Печенье, 1 уп., 75.75"};
        CheckPrinterImproved cpi = new CheckPrinterImproved();
        cpi.printCheck(items);
    }

    private int findMaxLength(String[] elements) {
        int max = 0;
        for (String e : elements) {
            if (e.length() > max) {
                max = e.length();
            }
        }
        return max;
    }

    public void printCheck(String[] items) {
        int maxNameLength = 0;
        int maxNumLength = 0;
        int maxPriceLength = 0;
        String[] namesArr = new String[items.length];
        String[] numsArr = new String[items.length];
        String[] pricesArr = new String[items.length];
        for (int i = 0; i < items.length; i++) {
            String[] itemData = items[i].split(", ");
            namesArr[i]=itemData[0];
            numsArr[i]=itemData[1];
            pricesArr[i]= itemData[2];
        }

        maxNameLength = findMaxLength(namesArr);
        maxNumLength = findMaxLength(numsArr);
        maxPriceLength = findMaxLength(pricesArr);
        for (int i = 0; i < namesArr.length; i++) {
            System.out.printf("%-"+(maxNameLength)+"s%"+(maxNumLength+2)+"s%"+(maxPriceLength+2)+"s%n",
                    namesArr[i],numsArr[i],pricesArr[i]);
        }
    }
}
/**
 * Задача усложняется! Ограничений на количество символов в строках наименования товара, количества и цены больше нет.
 * При этом самая длинная строка с наименованием товара и его количеством должна разделяться ровно двумя пробелами.
 * То же самое между количеством и ценой.
 * Для входных данных:
 * {"Пицца, 1 шт., 310.50", "Чай, 2 шт., 113.30", "Печенье, 1 уп., 75.75"}
 * Такой вывод программы корректен:
 * Пицца,         1003 шт.,  311431.50
 * Чай,           12 шт.,    1359.60
 * Печенье,       1 уп.,     75.75
 * Нить красная,  1 клубок,  12.23
 * А такой уже нет:
 * Пицца,            1003 шт.,    311431.50
 * Чай,              12 шт.,      1359.60
 * Печенье,          1 уп.,       75.75
 * Нить красная,     1 клубок,    12.23
 * Вам в помощь реализована функция int findMaxLenght(String[] elements).
 * Она пройдёт по массиву строк и вернёт размер максимального элемента этого массива.
 */