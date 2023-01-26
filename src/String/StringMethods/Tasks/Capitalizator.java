package String.StringMethods.Tasks;
/**
 *  Нужно начинать новое предложение с большой буквы.
 */

import java.util.Locale;

public class Capitalizator {
    public static void main(String[] args) {
        Capitalizator2 check = new Capitalizator2();
        System.out.println(check.capitalize("я не волшебник, я только учусь!"));
    }
}

class Capitalizator2 {
    public String capitalize(String str) {
        return str.substring(0, 1).toUpperCase(Locale.ROOT) + str.substring(1);
    }
}