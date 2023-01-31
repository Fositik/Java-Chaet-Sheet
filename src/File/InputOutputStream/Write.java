package File.InputOutputStream;


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Write {

    public static void main(String[] args) throws IOException {
        boolean append;
        Writer fileWriter = new FileWriter("filewriter.txt", append = true);

        fileWriter.write("новая запись в новый файл\n");
        fileWriter.write("добавляем текст");

        fileWriter.close();
    }
}
