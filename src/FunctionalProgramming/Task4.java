package FunctionalProgramming;



import java.time.LocalDateTime;
        import java.time.temporal.ChronoUnit;
        import java.util.LinkedList;
        import java.util.List;


interface StringsSaverTransformer {
    // как нужно преобразовать сохраняемую строку?
    String transform(String line);
}


interface StringsSaverOnSaveListener {
    // дополнительное действие при сохранении
    void onSave(String line);
}


interface StringsSaverOnRemoveListener {
    // дополнительное действие при удалении
    void onRemove(String line);
}

class StringsSaver3 {
    public static final int MAX_SIZE = 10_000;

    private List<String> saved = new LinkedList<>();
    private StringsSaverTransformer transformer;
    private StringsSaverOnSaveListener onSaveListener;
    private StringsSaverOnRemoveListener onRemoveListener;

    public void setTransformer(StringsSaverTransformer transformer) {
        this.transformer = transformer;
    }

    public void onSave(StringsSaverOnSaveListener onSaveListener) {
        this.onSaveListener = onSaveListener;
    }

    public void onRemove(StringsSaverOnRemoveListener onRemoveListener) {
        this.onRemoveListener = onRemoveListener;
    }

    public void save(String line) {
        if (onRemoveListener != null) {
            // напишите ваш код здесь
            onRemoveListener.onRemove(line);
        }
        if (transformer != null) {
            line = transformer.transform(line);
        }
        saved.add(line);
        if (onSaveListener != null) {
            onSaveListener.onSave(line);
        }
    }

    public List<String> getSaved() {
        return saved;
    }
}

public class Task4 {
    public static void main(String[] args) {
        StringsSaver3 saver = new StringsSaver3();

        /* Реализация через старый интерфейс
        StringsSaverConfig config = new StringsSaverConfig() {
            // в этом поле задаётся максимальная длина исходного сообщения
						final int lineLengthLimit = 100;

            @Override
            public String transform(String line) {
                return "[" + LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES) + "] " + line;
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
        */

        // передайте логику из старой реализации
        saver.setTransformer(new StringsSaverTransformer() {
            @Override
            public String transform(String line) {
                return "[" + LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES) + "] " + line;
            }
        });

        // передайте логику из старой реализации
        saver.onSave(new StringsSaverOnSaveListener() {
            final int lineLengthLimit = 100;
            @Override
            public void onSave(String line) {
                if (line.contains("ERROR")) {
                    if (line.length() > lineLengthLimit) {
                        line = line.substring(0, lineLengthLimit) + "...";
                    }
                    System.out.println(line);
                }
            }
        });

        saver.save("Пользователь залогинился.");
        saver.save("ERROR Пользователь загрузил фото.");
        saver.save("Пользователь пополнил счёт.");
        saver.save("Пользователь продлил подписку.");
        saver.save("ERROR Пользователь опубликовал пост.");
        System.out.println(saver.getSaved());
    }
}