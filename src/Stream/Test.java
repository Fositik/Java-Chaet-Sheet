package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        /**
         * Если нужно убедиться, что все элементы стрима удовлетворяют определённому условию,
         * используйте операцию allMatch(), передав ей проверяемый предикат.
         */
        boolean findFirst = Stream.of("film 1", "film 2", "video 1", "shorts", "serial", "movie")
                .allMatch(title -> title.startsWith("film"));
        System.out.println(findFirst);
        System.out.println("-------------------------");
        boolean contains = Stream.of("film 1", "film 2", "video 1", "shorts", "serial", "movie")
                .anyMatch(title -> title.toUpperCase(Locale.ROOT).contains("FILM"));
        System.out.println(contains);
        System.out.println("-------------------------");
        Optional<String> mbFind = Stream.of("film 1", "film 2", "video 1", "shorts", "serial", "movie")
                .findFirst();
        if (mbFind.isPresent()) {
            System.out.println("Its find: " + mbFind.get());
        } else {
            System.out.println("Film is not found");
        }
        System.out.println("-------------------------");
        String text = Stream.of("фильм «Компиляторы-убийцы»", "сериал «Спринг»", "сериал «Алгоритмы»", "фильм «Матрица: двумерный обход»")
                .collect(Collectors.joining(" | "));
        System.out.println(text);
        System.out.println("-------------------------");
        List<String> collect = Stream.of("фильм «Компиляторы-убийцы»", "сериал «Спринг»", "сериал «Алгоритмы»", "фильм «Матрица: двумерный обход»")
                .collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("-------------------------");
        Stream.of("фильм «Компиляторы-убийцы»", "сериал «Спринг»", "сериал «Алгоритмы»", "фильм «Матрица: двумерный обход»")
                .filter(title -> title.toLowerCase(Locale.ROOT).contains("фильм"))
                .forEach(System.out::println);
        System.out.println("-------------------------");
        /**
         * перация map() принимает реализацию функционального интерфейса Function.
         * Новый стрим будет состоять из значений, которые вернёт метод apply() этого интерфейса,
         * применённый к элементам исходного стрима.
         */
        Map<String, Integer> ratings = new HashMap<>();
        ratings.put("фильм «Компиляторы-убийцы»", 3);
        ratings.put("сериал «Спринг»", 5);
        ratings.put("сериал «Алгоритмы»", 4);
        ratings.put("фильм «Матрица: двумерный обход»", 5);

        Stream.of("фильм «Компиляторы-убийцы»", "сериал «Спринг»", "сериал «Алгоритмы»", "фильм «Матрица: двумерный обход»")
                .map(ratings::get)
                .forEach(System.out::println);
        System.out.println("-------------------------");
        /**
         * в flatMap() каждый элемент исходного стрима превращается в 0, 10,1 или несколько элементов нового стрима.
         */
        Stream.of("ПРОРЫВ В ЭКОНОМИКЕ", "ЛУЧШЕЕ ДЕТЯМ", "ЛУЧШЕЕ В ЭКОНОМИКЕ")
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .forEach(System.out::println);
        System.out.println("-------------------------");
        /**
        * Чтобы захватить из старого стрима в новый несколько первых элементов,
        * используйте limit() с указанием точного количества.
        */
        Stream.of("Пирамиды", "Эверест", "Колизей")
                .limit(3)
                .forEach(System.out::println);
        System.out.println("-------------------------");
        /**
         * Промежуточные операции можно применять одну за другой.
         */
        Stream.of("Надя", "Ольга", "Марат", "Света", "Ева")
                .map(String::length)
                .filter(len -> len == 3)
                .limit(4)
                .forEach(System.out::println);
        System.out.println("-------------------------");
        /**
         * Метод distinct()позволяет получить стрим из уникальных элементов исходного стрима.
         */


    }
}

