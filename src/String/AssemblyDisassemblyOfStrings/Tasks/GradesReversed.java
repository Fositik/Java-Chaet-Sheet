package String.AssemblyDisassemblyOfStrings.Tasks;

import java.util.ArrayList;
import java.util.Locale;

public class GradesReversed {
    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    public String serializeGrades(String[] grades) {

        StringBuilder sb = new StringBuilder();
        for (String grade : grades) {
            String[] gradeData = grade.split(" ");
            String list = String.join(",", gradeData[0].toLowerCase(), gradeData[1].toLowerCase(),
                    gradeData[2].toUpperCase(), gradeStringToInt(gradeData[4]));
            sb.append(list+";");
        }
        return sb.toString();
    }

}
/**
 * Программа по учёту оценок сломалась, но в нашей части системы сохранились бэкапы!
 * Проведите преобразование, обратное тому, которое было в предыдущем задании. На вход теперь подаётся массив строк:
 * Вероника Чехова физика — Безупречно
 * Анна Строкова математика — Потрясающе
 * Иван Петров геометрия — Безупречно
 * Требуется превратить их в одну запись вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка".
 * Метод для перевода оценки в строку-число уже реализован.
 */
