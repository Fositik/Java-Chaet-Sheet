package File;
import java.io.File;

public class FileMethods2 {

    private static final String HOME = System.getProperty("user.home");

    public static void main(String[] args) {

        // определение объекта для директории
        File dir = new File(HOME + File.separator + "NewDir");

        boolean created = dir.mkdir();
        if (created) {
            System.out.println("Директория создана.");
        }

        // присвоение нового имени директории
        File newDir = new File(HOME + File.separator + "NewDirRenamed");
        dir.renameTo(newDir);

        // удаление директории
        boolean deleted = newDir.delete();
        if (deleted) {
            System.out.println("Директория удалена.");
        }
    }
}

