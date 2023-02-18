package FunctionalProgramming;



import java.time.temporal.ChronoUnit;
        import java.time.LocalDateTime;
        import java.util.LinkedList;
        import java.util.List;

class StringsSaver1 {
    // количество запоминаемых строк
    public static final int MAX_SIZE = 3;

    private List<String> saved = new LinkedList<>();

    private boolean doAddDate; // добавлять ли дату?
    private boolean doPrintErrors;
    public void setDoAddDate(boolean doAddDate) {
        this.doAddDate = doAddDate;
    }

    // сохранить строку
    public void save(String line) {
        if (saved.size() == MAX_SIZE) {
            saved.remove(0);
        }

        if (doAddDate) {
            line = "[" + LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES) + "] " + line;
        }
        saved.add(line);
        if (setDoPrintError(true)){
            System.out.println("ERROR"+line);
        }
    }
    public boolean setDoPrintError(boolean doPrintError){
        return doPrintError;
    }
    // получить последние MAX_SIZE сохранённых строк
    public List<String> getSaved() {
        return saved;
    }
}

public class Task1 {
    public static void main(String[] args) {
        StringsSaver1 saver = new StringsSaver1();
        saver.setDoAddDate(true); // включаем режим
        saver.save("Пользователь залогинился.");
        saver.save("Пользователь загрузил фото.");
        saver.save("Пользователь пополнил счёт.");
        saver.save("Пользователь продлил подписку.");
        saver.save("Пользователь опубликовал пост.");
        System.out.println(saver.getSaved());
    }
}