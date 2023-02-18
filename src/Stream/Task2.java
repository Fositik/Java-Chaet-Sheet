package Stream;



import java.util.List;
import java.util.stream.Stream;

class Flat2 {
    private String city;
    private int price;
    private int area;

    public Flat2(String city, int price, int area) {
        this.city = city;
        this.price = price;
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public int getPrice() {
        return price;
    }

    public int getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "city='" + city + '\'' +
                ", price=" + price + "$" +
                ", area=" + area + " кв.м." +
                '}';
    }
}

public class Task2 {

    public static void main(String[] args) {
        List<Flat2> all = List.of(
                new Flat2("Амстердам", 150_000, 50),
                new Flat2("Санкт-Петербург", 350_000, 130),
                new Flat2("Амстердам", 900_000, 150),
                new Flat2("Рим", 60_000, 200),
                new Flat2("Лондон", 3000, 30)
        );

        all.stream()
                .filter(flat -> flat.getPrice() < 100_000)
                .filter(flat -> flat.getArea() > 100)
                .map(Flat2::getCity)
                .distinct()
                .forEach(System.out::println);
    }
}