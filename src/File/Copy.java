package File;

import java.io.IOException;
        import java.nio.file.FileAlreadyExistsException;
        import java.nio.file.Files;
        import java.nio.file.Path;
        import java.nio.file.Paths;


public class Copy {


    private static final String HOME = System.getProperty("user.home");

    public static void main(String[] args) {

        // исходный файл
        Path sourceFile = Paths.get(HOME, "test.txt");
        // директория назначения
        Path targetDir = Paths.get(HOME, "test");

        copyFile(sourceFile, targetDir);
    }

    public static void copyFile(Path sourceFile, Path targetDir) {
        Path targetFile = targetDir.resolve(sourceFile.getFileName());

        try {
            Files.copy(sourceFile, targetFile);
        } catch (FileAlreadyExistsException e) {
            System.out.format("Файл %s уже существует.", targetFile);
        } catch (IOException e) {
            System.err.format("Произошла ошибка во время копирования файла.");
        }
    }

}