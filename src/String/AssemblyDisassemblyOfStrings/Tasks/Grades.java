package String.AssemblyDisassemblyOfStrings.Tasks;

import java.util.Locale;

public class Grades {

    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }

    // grades - строка вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка;"
    public void gradeBeautifier(String grades) {
        Grades gr = new Grades();
        String[] students = grades.split(";");
        for (String student : students) {
            String[] currentStudent = student.split(",");
            System.out.print(gr.capitalize(currentStudent[0]) + " " +
                    gr.capitalize(currentStudent[1]) + " " +
                    currentStudent[2].toLowerCase() + " — " + gr.gradeToString(currentStudent[3])+"\n");

        }
    }


}
/**
 * '—'
 * Вероника Чехова физика — Безупречно
 * Анна Строкова математика — Потрясающе
 * Иван Петров геометрия — Безупречно
 */