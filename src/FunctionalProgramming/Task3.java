package FunctionalProgramming;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class User {
    protected String name;
    protected int sum;
    protected boolean isActive;

    public User(String name, int sum, boolean isActive) {
        this.name = name;
        this.sum = sum;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return sum == user.sum && isActive == user.isActive && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sum, isActive);
    }

    @Override
    public String toString() {
        return "Task3{" +
                "name='" + name + '\'' +
                ", sum=" + sum +
                ", isActive=" + isActive +
                '}';
    }
}

public class Task3 {
    public static void main(String[] args) {
        User user = new User("Sabtita Roch", 5, true);
        List<User> clients = new ArrayList<>();
        clients.add(new User("Harry Poter", 3, true));
        clients.add(new User("Hermiona Granger", 12, false));
        clients.add(new User("Tom  Braun", 6, true));
        clients.add(new User("Mike Ashley", 1, false));
        clients.add(new User("Sabtina Rich", 7, true));
        clients.add(new User("Lisa Tomas", 0, false));
        clients.add(new User("Sara Connor", 2, true));
        clients.add(new User("Robert Deniro", 10, false));

        clients.forEach(client -> client.setSum(client.getSum() + 1));

        int pay = clients.stream()
                .filter(c -> c.getSum() > 2)
                .filter(User::isActive)
                .reduce(0, (Integer, client) -> Integer + client.getSum(), Integer::sum);
        System.out.println(pay);

        addHello(user::getName,user::setName);
        System.out.println(user.getName());

        Predicate<String> x = (String text) ->{
            return  Character.isUpperCase(text.charAt(0));
        };

        Consumer<String> hey = (String name)->{
            System.out.println("Hello "+ name+"!");
        };
        hey.accept("Vova");
        Consumer<String> hello = name -> System.out.println("Hello "+ name+"!");
        hello.accept("Vladimir");

        Comparator<String> comparator = (s1,s2)->s1.length()-s2.length();
        System.out.println(comparator.compare("Vladimir","Vova"));

        Predicate<List<Integer>> sortedPredicate = list -> {
            if (list.size() <= 1) return true;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) < list.get(i - 1)) return false;
            }
            return true;
        };
/**
 *    Predicate<List<Integer>> sortedPredicate = new Predicate<List<Integer>>() {
 *             @Override
 *             public boolean test(List<Integer> list) {
 *                 if (list.size() <= 1) return true;
 *                 for (int i = 1; i < list.size(); i++) {
 *                     if (list.get(i) < list.get(i - 1)) return false;
 *                 }
 *                 return true;
 *             }
 *     };
 */

    List<Integer> list = List.of(4, 8, 15, 16, 23, 32);
        System.out.println("Отсортирован?");
        System.out.println(sortedPredicate.test(list));
    }
    public static void addHello(Supplier<String> supplier, Consumer<String> consumer){
        consumer.accept("Hello "+ supplier.get());
    }



}
