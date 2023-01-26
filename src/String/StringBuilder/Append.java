package String.StringBuilder;

public class Append {

    public static void main(String[] args) {

        String start = "Привет! Меня зовут ";

        StringBuilder hello = new StringBuilder(start); // создайте StringBuilder с началом start

        hello.append("Вова"); // добавьте подстроку "<ваше имя>"
        hello.append(". Я из города "); // добавьте подстроку ". Я из города "
        hello.append("Йошкар-Ола."); // добавьте подстроку "<ваш город>."

        String asString = hello.toString();
        System.out.println(asString);
    }
}

