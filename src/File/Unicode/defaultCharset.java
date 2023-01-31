package File.Unicode;


import java.nio.charset.Charset;

public class defaultCharset {

    public static void main(String[] args) {
        System.out.println(Charset.defaultCharset().displayName());
    }
}