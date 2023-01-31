package File.InputOutputStream.Tasks;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BuffReaderTask {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> frequencyMap = new HashMap<>();

        FileReader reader = new FileReader("result.txt");
        BufferedReader br = new BufferedReader(reader);

        // читайте файл построчно и сразу обновляйте frequencyMap.
        int A = 0, B = 0, C = 0, D = 0;
        while (br.ready()) {
            String line = br.readLine();
            System.out.println(line);
            if (line.equals("A")) A++;
            else if (line.equals("B")) B++;
            else if (line.equals("C")) C++;
            else D++;
        }
        System.out.println("A: "+A+"\nB: "+B+"\nC: "+C+"\nD: "+D);
        br.close();
        // выведите результат в формате "<буква>: <количество>".

    }
}