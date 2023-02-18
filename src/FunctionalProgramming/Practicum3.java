package FunctionalProgramming;


import java.util.Objects;
import java.util.function.Predicate;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Predicate<Person> isOlderPredicate() {
        return person -> person.age > age;
    }
}


public class Practicum3 {

    public static void main(String[] args) {
        Person kostya = new Person("Костя", 5);

        System.out.println(kostya.isOlderPredicate().test(new Person("Старше", 10))); // true
        System.out.println(kostya.isOlderPredicate().test(new Person("Младше", 3))); // false
    }
}