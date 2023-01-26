package String.StringBuilder;

public class Reverse {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("!dlrow ,olleH");
        builder.reverse();
        System.out.println(builder.toString()); // выведет "Hello, world!"
    }
}
/**
 * Перевернуть строку позволяет метод reverse().
 */