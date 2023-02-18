package UTC;
import java.time.Instant;
import java.util.Random;

public class Instantt {
    public static void main(String[] args) {
        Instant curretTimestamp = Instant.now();
        System.out.println(curretTimestamp);
        /**
         * Посчитать количество миллисекунд с Unix-эпохи до конкретной метки времени можно с помощью метода toEpochMilli()
         */
        long ms = curretTimestamp.toEpochMilli();
        System.out.println(ms);

        // передаём количество секунд с запуска спутника до Unix-эпохи
        Instant satelliteLaunchFromSec = Instant.ofEpochSecond(-386310686L);
        // или делаем то же самое в миллисекундах
        Instant satelliteLaunchFromMillis = Instant.ofEpochMilli(-386310686000L);

        System.out.println(satelliteLaunchFromSec + " — время запуска, заданное через секунды.");
        System.out.println(satelliteLaunchFromMillis + " — время запуска, заданное через миллисекунды.");

        System.out.println(Instant.MIN);
        System.out.println(Instant.MAX);

        Instant currentMoment = Instant.now();
        System.out.println(currentMoment);
        Instant futureMoment = currentMoment.plusMillis(180000);
        System.out.println(futureMoment);

        int chickenUnixSecond = new Random().nextInt(1000000000);
        Instant chickenMoment = Instant.ofEpochSecond(chickenUnixSecond);

        int eggUnixSecond = new Random().nextInt(1000000000);
        Instant eggMoment = Instant.ofEpochSecond(eggUnixSecond);

        System.out.println("Курица появилась в " + chickenMoment);
        System.out.println("Яйцо появилось в " + eggMoment);

        if (chickenMoment.isBefore(eggMoment)) {
            System.out.println("Первой была курица!");
        }
        if (chickenMoment.isAfter(eggMoment)) {
            System.out.println("Первым было яйцо!");
        }
        if (chickenMoment.equals(eggMoment)) {
            System.out.println("Яйцо было одновременно с курицей ¯\\_(ツ)_/¯)!");
        }
    }
}
