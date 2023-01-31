package File.InputOutputStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("bufferedreader.txt");
        BufferedReader br = new BufferedReader(reader);

        while (br.ready()) {
            String line = br.readLine();
            System.out.println(line);
        }

        br.close();
    }
}