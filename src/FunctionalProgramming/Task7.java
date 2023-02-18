package FunctionalProgramming;


import java.util.function.UnaryOperator;

class Person1 {
    private String name;
    private String favouriteSpice;

    public Person1(String name, String favouriteSpice) {
        this.name = name;
        this.favouriteSpice = favouriteSpice;
    }

    public String getName() {
        return name;
    }

    public String getFavouriteSpice() {
        return favouriteSpice;
    }

    public UnaryOperator<String> addFavouriteSpice() {
        return recipe->recipe+" "+favouriteSpice;
    }
}

//class Adder implements UnaryOperator<String> {
//    Person person;
//
//    public Adder(Person person) {
//        this.person = person;
//    }
//
//    @Override
//    public String apply(String recipe) {
//        return recipe + " " + person.getFavouriteSpice();
//    }
//}
public class Task7 {
    public static void main(String[] args) {
        Person1 petya = new Person1("Петя", "паприка");

        String oldRecipe = "тесто томаты курица сыр";
        UnaryOperator<String> petyaAdder = petya.addFavouriteSpice();

        String newRecipe = petyaAdder.apply(oldRecipe);
        System.out.println(newRecipe);
    }
}