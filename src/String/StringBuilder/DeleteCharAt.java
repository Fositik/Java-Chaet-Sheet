package String.StringBuilder;

public class DeleteCharAt {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hhellllllo!");
        builder.deleteCharAt(1); // удалит элемент 'h'
        builder.delete(2, 6);    // удалит все лишние символы 'l'
        System.out.println(builder.toString()); // выведет строку "Hello!"
    }
}
/**
 * При удалении по двум индексам,
 * первый индекс берётся включительно,
 * а второй нет (аналогично методу замены replace(int, int, String)).
 */