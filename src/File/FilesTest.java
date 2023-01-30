package File;

import java.io.IOException;
        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.nio.file.Paths;
        import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class FilesTest {

    private static final String HOME = System.getProperty("user.home");

    public static void main(String[] args) throws IOException {

        // создание файла testFile
        Path testFile =
                Files.createFile(Paths.get(HOME, "testFile.txt"));

        if (Files.exists(Paths.get(HOME, "testFile.txt"))) {
            System.out.println("Файл успешно создан.");
        }

        // создание директории testDirectory
        Path testDirectory = Files.createDirectory(Paths.get(HOME,
                "testDirectory"));
        if (Files.exists(Paths.get(HOME, "testDirectory"))) {
            System.out.println("Директория успешно создана.");
        }

        // перемещение файла testFile в директорию testDirectory
        testFile = Files.move(testFile,
                Paths.get(HOME, "testDirectory", "testFile.txt"),
                REPLACE_EXISTING);

        if (Files.exists(
                Paths.get(HOME, "testDirectory", "testFile.txt"))) {

            System.out.println("Файл перемещён в testDirectory.");
        }

        // удаление файла
        Files.delete(testFile);
        if (!Files.exists(
                Paths.get(HOME, "testDirectory", "testFile.txt"))) {

            System.out.println("Тестовый файл удалён.");
        }

        // удаление пустой директории
        Files.delete(testDirectory);
        if (!Files.exists(Paths.get(HOME, "testDirectory"))) {
            System.out.println("Директория удалена.");
        }
    }
}
/**
 * Path createFile(Path path, FileAttribute<?>... attrs) создаёт новый пустой файл.
 * Выбрасывает исключение, если файл уже существует. Параметры метода: path — путь к файлу,
 * который нужно создать, attrs — необязательный список атрибутов файла (в нём можно указать правила доступа к файлу,
 * добавить информацию о создателе и так далее);
 *
 * Path createDirectory(Path dir, FileAttribute<?>... attrs) создаёт новую директорию.
 * Параметры метода: dir — директория, которую нужно создать, attrs — необязательный список атрибутов директории;
 *
 * Path move(Path source, Path target, CopyOption. . . options) перемещает файл.
 * Параметры метода: source — путь к файлу, который нужно переместить, target — путь к файлу назначения,
 * options — необязательные параметры, определяющие, как нужно делать перемещение;
 *
 * void delete(Path path) удаляет файл или директорию. Если удаляется директория, необходимо убедиться,
 * что она пуста, иначе будет получено исключение DirectoryNotEmptyException. Если удаляется файл,
 * необходимо убедиться, что он существует, иначе будет получено исключение NoSuchFileException.
 * Параметры метода: path — путь к файлу или директории, которые нужно удалить;
 * boolean deleteIfExists(Path path) удаляет файл или директорию, если они существуют.
 * Параметры метода: path — путь к файлу, который нужно удалить. Возвращаемое значение:
 * true — если файл был удалён этим методом, false — если файл не может быть удалён, потому что не существует.
 */