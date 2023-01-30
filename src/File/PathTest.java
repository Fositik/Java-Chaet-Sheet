package File;


import java.nio.file.Path;
        import java.nio.file.Paths;

public class PathTest {

    private static final String HOME = System.getProperty("user.home");

    public static void main(String[] args) {

        // создание объекта Path с помощью статического метода get() класса Paths
        Path testFilePath = Paths.get(HOME, "test", "file.txt");

        // вывод информации о файле
        System.out.println("Информация о файле: ");
        System.out.println(" - имя: " + testFilePath.getFileName());
        System.out.println(" - корневая директория: " + testFilePath.getRoot());
        System.out.println(" - родительская директория: " + testFilePath.getParent());

        // вывод элементов пути
        System.out.println("Элементы пути: ");
        for (Path element : testFilePath) {
            System.out.println(" - элемент пути: " + element);
        }
    }
}
/**
 * Path getFileName() возвращает имя файла из пути;
 * Path getParent() возвращает «родительскую» директорию по отношению к текущему пути
 * (ту, которая находится выше по дереву директорий);
 * Path getRoot() возвращает «корневую» директорию (ту, которая находится на вершине дерева директорий).
 */