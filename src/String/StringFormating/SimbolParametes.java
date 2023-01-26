package String.StringFormating;

public class SimbolParametes {
    public static void main(String[] args) {
        String pizza = "Пицца, 1 шт., 310.50";
        String tea = "Чай, 1 шт., 113.30";
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.print(numbers[0]);
        System.out.printf("%25s", pizza);
        System.out.println();
        System.out.print(numbers[1]);
        System.out.printf("%25s", tea);

        System.out.println();
        System.out.println();

        String discount = "-10%";
        System.out.printf("%-25s", pizza);
        System.out.println(discount);

        System.out.println();

        System.out.printf("%1.12s", pizza); // Выведет не менее одного символа и не более 12

        System.out.println();
        System.out.println();

        double price = 12345.6789;
        System.out.printf("%2.2f", price); // Выведет 12345.68
        /**
         * Первое число в записи преобразования всё так же будет обозначать минимальное количество выводимых символов,
         * а вот второе уже количество символов после запятой. Округление при этом произойдёт по правилам математики.
         */
    }
}
