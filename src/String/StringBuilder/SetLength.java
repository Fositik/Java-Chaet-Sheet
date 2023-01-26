package String.StringBuilder;

public class SetLength {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("hellodghkwennalmc/ skm");
        builder.setLength(5); // останется только пять символов
        System.out.println(builder.toString()); // выведет строку "hello"
    }
}
/**
 * Метод setLength(int newLength) позволяет оставить только заданное количество символов.
 * Для этого нужно передать в него нужную длину строки.
 */