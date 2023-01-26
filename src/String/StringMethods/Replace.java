package String.StringMethods;
/*
public class ReplaceMethods {

    public static void main(String[] args) {
        String vegetables = "Томат — зелёный, а морковка — оранжевая";

        System.out.println(vegetables.replace("а", "А").replaceFirst("зелёный",
                "красный"));
        // Выведет: "ТомАт — красный, А морковкА — орАнжевАя"
    }
}*/
public class Replace {
    public static void main(String[] args) {
        String rules = "На зелёный цвет — стой на месте;\n" +
                "на зелёный цвет — приготовься;\n" +
                "на зелёный — осмотрись, а затем смело шагай.";
        String replaced = rules.replaceFirst("зелёный","красный").
                replaceFirst("зелёный","желтый").
                replace("цвет","свет");


        System.out.println(replaced);
    }
}

