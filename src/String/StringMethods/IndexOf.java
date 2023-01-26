package String.StringMethods;

/**
 * Нужно написать метод, который будет проверять, что какая-то подстрока встречается в строке только один раз.
 */

public class IndexOf {
    public boolean onlySingleSubstring(String initialString, String substring) {
        return initialString.indexOf(substring) == initialString.lastIndexOf(substring);
    }

    public static void main(String[] args) {
        var os = new IndexOf();
        System.out.println(os.onlySingleSubstring("раз два, раз два", "раз"));
        System.out.println(os.onlySingleSubstring("раз два", "раз"));
    }
}