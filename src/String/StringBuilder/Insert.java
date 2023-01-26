package String.StringBuilder;

public class Insert {
    public static void main(String[] args) {
        StringBuilder example = new StringBuilder("Helo!");
        example.insert(3, "l"); // добавили "l" на 3-ю позицию перед "o"
        System.out.println(example.toString()); // выведет строку "Hello!"
    }
}
/**
 * Вставка всегда сдвигает символы вправо.
 */