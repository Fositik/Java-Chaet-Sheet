package String.StringBuilder;

public class Replace {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hillo, world!");
        builder.replace(1,2, "e");
        builder.replace(7,13, "java!");

        System.out.println(builder.toString());// выведет строку "Hello, java!"
    }
}