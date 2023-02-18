package FunctionalProgramming;


import java.util.*;

public class AnonComparator {
    public static void main(String[] args) throws Exception {
        List<String> people = new ArrayList<>(List.of(
                "Мария Зуева",
                "Анна Дарк",
                "Кирилл Филимонов",
                "Ева Пинк"
        ));

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] os1 = o1.split(" ");
                String[] os2 = o2.split(" ");

                int dist1 = Math.abs(os1[0].length());
                int dist2 = Math.abs(os2[0].length());
                return dist1 - dist2;
            }
        };// <-- напишите свой код здесь

        Collections.sort(people, comparator);
        System.out.println(people);
    }
}