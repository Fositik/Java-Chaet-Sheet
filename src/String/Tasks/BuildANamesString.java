package String.Tasks;

import java.util.ArrayList;
import java.util.List;

public class BuildANamesString {
    public static void main(String[] args) {
        BuildANamesString buildANamesString = new BuildANamesString();
        List<String> names = new ArrayList<>();
        names.add("Aня");
        names.add("Олег");
        names.add("Aнтон");
        names.add("Степан");
        names.add("Aлександр");
        System.out.println( buildANamesString.buildANamesString(names));
    }
    public String buildANamesString(List<String> names) {
        String result = "";

        for (String name : names) {
            if (name.charAt(0) == 'A') {
                result += name;
            }
        }

        return result;
    }

}
