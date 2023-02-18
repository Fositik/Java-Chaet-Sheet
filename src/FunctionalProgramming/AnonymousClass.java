import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

interface StringsSaverConfig {
    // как нужно преобразовать сохраняемую строку?
    String transform(String line);

    // дополнительное действие при сохранении
    void onSave(String line);
}

class StringsSaver {
    public static final int MAX_SIZE = 10_000;

    private List<String> saved = new LinkedList<>();
    private StringsSaverConfig config;

    public StringsSaver(StringsSaverConfig config) {
        this.config = config;
    }

    public void save(String line) {
        if (saved.size() == MAX_SIZE) {
            saved.remove(0);
        }
        line = config.transform(line);
        saved.add(line);
        config.onSave(line);
    }

    public List<String> getSaved() {
        return saved;
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        StringsSaverConfig config = new StringsSaverConfig() {
            // в этом поле задаётся максимальная длина исходного сообщения
            final int lineLengthLimit = 100;

            @Override
            public String transform(String line) {
                return "[" + LocalDateTime.now() + "] " + line;
            }

            @Override
            public void onSave(String line) {
                if (line.contains("ERROR")) {
                    if (line.length() > lineLengthLimit) {
                        line = line.substring(0, lineLengthLimit) + "...";
                    }
                    System.out.println(line);
                }
            }
        };
        StringsSaver saver = new StringsSaver(config);
        saver.save("Пользователь залогинился.");
        saver.save("ERROR Пользователь загрузил фото.");
        saver.save("Пользователь пополнил счёт.");
        saver.save("Пользователь продлил подписку.");
        saver.save("ERROR Пользователь опубликовал пост.");
        System.out.println(saver.getSaved());
    }
}