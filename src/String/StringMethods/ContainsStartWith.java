package String.StringMethods;

/**
 * Всего в String три метода для поиска подстроки:
 * boolean contains(String other) возвращает true, если подстрока будет обнаружена в любом месте строки, иначе false.
 * boolean startsWith(String other) вернёт true, если подстрока находится в начале строки, иначе false.
 * boolean endsWith(String other) вернёт true, если подстрока в конце строки, иначе false.
 */
public class ContainsStartWith {

    public static void main(String[] args) {
        System.out.println("раз два три".contains("раз"));    // true
        System.out.println("раз два три".contains("два"));    // true
        System.out.println("раз два три".contains("три"));    // true

        System.out.println("раз два три".startsWith("раз"));  // true
        System.out.println("раз два три".startsWith("два"));  // false
        System.out.println("раз два три".startsWith("три"));  // false

        System.out.println("раз два три".endsWith("раз"));    // false
        System.out.println("раз два три".endsWith("два"));    // false
        System.out.println("раз два три".endsWith("три"));    // true
    }
}

