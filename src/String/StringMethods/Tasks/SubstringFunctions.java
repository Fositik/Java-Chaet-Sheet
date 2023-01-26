package String.StringMethods.Tasks;

/**
 * Нужно реализовать метод boolean endsWith(String initial, String other)
 * — для поиска не по началу слова, а по окончанию. Метод должен возвращать true,
 * если строка initial заканчивается на строку other, иначе false. Например,
 * для сочетания «жираф» и «раф», результат должен быть true, так как строка «жираф» заканчивается на слово «раф»,
 * а вот для сочетания «кошка» и «каша» должно вернуться false.
 */
public class SubstringFunctions {
    public boolean startsWith(String initial, String other) {
        // реализуйте метод
        if (initial.lastIndexOf(other) + other.length() == initial.length()) {
            return true;
        } else
            return false;
    }
}