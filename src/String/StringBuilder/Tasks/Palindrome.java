package String.StringBuilder.Tasks;

import java.util.Locale;

public class Palindrome {

    public boolean isPalindromeWord(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);

        if (stringBuilder.reverse().toString().equals(str)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPalindromeLine(String str) {
        /**
         * Ваш метод public boolean isPalindromeLine(String str) из прошлого задания работает,
         * но не совсем оптимально. Усовершенствуйте его так,
         * чтобы он мог обрабатывать не только отдельные слова, но и целые строки с пробелами.
         * Такие, как, к примеру, «Молебен о коне белом».
         */
        StringBuilder stringBuilder = new StringBuilder(str.toLowerCase());
        int j = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (!Character.isWhitespace(stringBuilder.charAt(i)))
                stringBuilder.setCharAt(j++, stringBuilder.charAt(i));
        }
        String s = stringBuilder.delete(j, stringBuilder.length()).toString();
        String sr = stringBuilder.delete(j, stringBuilder.length()).reverse().toString();
        if (s.equals(sr)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "Молебен о коне белом";
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindromeLine(str));
    }
}