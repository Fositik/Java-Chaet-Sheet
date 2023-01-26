package String.StringMethods.Tasks;


public class SubstringInput {
    public static void main(String[] args) {
        FindRepeats check = new FindRepeats();
        int count = check.numberOfRepeats("раз, раз, раз", "раз");
        System.out.println(count);
    }
}

/*class FindRepeats {
    long numberOfRepeats(String text, String substring) {
        long count = Arrays.stream((text + " ").split(substring)).count();
        return count-1;
    }
}*/

class FindRepeats {
    int numberOfRepeats(String text, String substring) {

        int count = 0;
        int index = 0;
        while (text.contains(substring)) {
            if (index != -1) {
                count++;
                index = text.indexOf(substring) + substring.length();//вернёт индекс символа, следующего за найденной подстрокой.
                text = text.substring(index, text.length()); //вернуть остаток текста через substring()
            } else break;
        }
        return count;
    }
}
