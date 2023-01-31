package File.Tasks;


import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class TaskTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество участников: ");
        int playersNumber = scanner.nextInt();

        List<String> words = readWordsFromFile("words.txt");

        // если слов меньше, чем участников, то выведите сообщение:
        // "Недостаточно слов в файле. Добавьте слова и обновите файл."
        // и завершите выполнение программы
        if (words.size() >= playersNumber) {

            // воспользуйтесь статическим методом Collections.shuffle(List<?> list),
            // чтобы поменять порядок слов случайным образом

            int wordsNumber = words.size() / playersNumber;

            for (int i = 0; i < playersNumber; i++) {
                String filename = String.format("player%s.txt", i + 1);
                List<String> subList = words.subList(i * wordsNumber, (i + 1) * wordsNumber);

                writeListToFile(subList, filename);
            }

            System.out.println("Карточки готовы!");
        } else {
            System.out.println("Недостаточно слов в файле. Добавьте слова и обновите файл.");
        }
    }

    private static List<String> readWordsFromFile(String filename) {
        // добавьте построчное чтение из файла с помощью BufferedReader
        // в случае ошибки выведите сообщение: "Произошла ошибка во время чтения файла."
        List<String> words = new ArrayList<>();
        try (FileReader reader = new FileReader(filename, UTF_8);
             BufferedReader br = new BufferedReader(reader))

        {
            while (br.ready()) {
                String s = br.readLine();
                words.add(s);
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка во время чтения файла.");
        }
        return words;
    }

    private static void writeListToFile(List<String> list, String filename) {
        // добавьте запись слов в файл с помощью FileWriter
        // в случае ошибки выведите сообщение: "Произошла ошибка во время записи файла."
        try (FileWriter fileWriter = new FileWriter(filename, UTF_8)) {
            for (String s : list) {
                fileWriter.write(s);
            }


        } catch (IOException e) {
            System.out.println("Произошла ошибка во время записи файла.");
        }
    }
}