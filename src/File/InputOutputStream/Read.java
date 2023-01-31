package File.InputOutputStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Read {

    public static void main(String[] args) throws IOException {
        Reader fileReader = new FileReader("filereader.txt");

        int data = fileReader.read();
        while (data != -1) {
            System.out.print((char) data);
            data = fileReader.read();
        }

        fileReader.close();
    }
}