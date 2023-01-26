package String.StringBuilder.Tasks;

public class PoemFixer {

    public String[] readPoem() {
        return new String[]{
                "   Это кто там ложку «ложит»?",
                "",
                "   ",
                "Знай, такого быть не может!",
                "  Ложку мы на стол кладём,  ",
                "",
                "А тебя – к обеду ждём."
        };
    }

    public String fixPoem(String[] poem) {
        StringBuilder s = new StringBuilder();
        //Сначала нужно создать пустой объект new StringBuilder().
        // В него будем записывать «очищенный» текст стихотворения.
        for (String line : poem) {
            //Второй шаг — построить цикл по всем строкам аргумента, переданного в метод fixPoem().
            // Сделать это можно, например, циклом forEach: for (String line: poem) {}.
            if (!line.isBlank() && !line.isEmpty())
                //На каждом шаге цикла нужно добавлять строку в объект StringBuilder,
                // но только если она не пустая и не состоит только из пробелов — методы isEmpty()
                // и isBlank() помогут это проверить.
                s.append(line.trim()+"\n");
            //При добавлении требуется также удалить лишние пробельные символы — здесь поможет append() и trim().
            // Их можно объединить sb.append(line.trim()).
        }
        return s.toString();
       }

    public static void main(String[] args) {
        PoemFixer poemFixer = new PoemFixer();
        String[] poem = poemFixer.readPoem();
        String poemAsString = poemFixer.fixPoem(poem);
        System.out.println(poemAsString);
    }
}