package String.AssemblyDisassemblyOfStrings;

public class Join {
    public static void main(String[] args) {
        String[] arrayOfPets = new String[]{
                "Кот Батончик",
                "Хомяк Рафаэлка",
                "Попугай Картошка"
        };

        String pets = String.join(", ", arrayOfPets);

        System.out.println("Мои питомцы: " + pets);
    }
}