package UTC.LocalDateTime;

import java.time.LocalDateTime;

import static java.util.Calendar.FEBRUARY;

public class TestLocalDateTime {
    public static void main(String[] args) {
        // сохраняем в currentMoment текущее время и дату устройства,
        // на котором запускается код
        LocalDateTime currentMoment = LocalDateTime.now();
        System.out.println(currentMoment);

        // передаём все единицы времени
        // год, месяц, день, часы, минуты, секунды, наносекунды
        LocalDateTime newMillennium = LocalDateTime.of(2000, 1, 1, 0, 0, 0, 0);
        System.out.println(newMillennium);
        // не передаём секунды и наносекунды
        LocalDateTime alsoNewMillennium = LocalDateTime.of(2000, 1, 1, 14, 0);
        System.out.println(alsoNewMillennium);

        // используем месяц из констант перечисления java.time.Month
        LocalDateTime dateTimeOfTwos = LocalDateTime.of(2222, FEBRUARY, 2, 22, 22);
        System.out.println(dateTimeOfTwos);

        LocalDateTime currentDataTime = LocalDateTime.now();
        System.out.println(currentDataTime);

        System.out.println("------------------------------------------");
        /**
         * Аналогично классу Instant, у LocalDateTime есть методы для получения новых экземпляров
         * на основе уже имеющихся значений:
         *
         * plusYears(long years)/minusYears(long years) — создаёт новый экземпляр даты и времени
         * с прибавлением/вычитанием указанного количества лет;
         * plusMonths(long months)/minusMonths(long months) — новый экземпляр с прибавлением/вычитанием
         * количества месяцев;
         * plusWeeks(long weeks)/minusWeeks(long weeks) — количества недель;
         * plusDays(long days)/minusDays(long days) — дней;
         * plusHours(long hoursToAdd)/minusHours(long hoursToSubtract) — часов;
         * plusMinutes(long minutesToAdd)/minusMinutes(long minutesToSubtract) — минут;
         * plusSeconds(long secondstoAdd)/minusSeconds(long secondsToSubtract) — секунд;
         * plusNanos(long nanosToAdd)/minusNanos(long nanosToSubtract) — наносекунд.
         */

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Сейчас " + currentDateTime);

        LocalDateTime twoWeeksAgo = currentDateTime.minusWeeks(2);
        System.out.println("Две недели назад было " + twoWeeksAgo);

        System.out.println("------------------------------------------------");
        /**
         * можно «цепочкой» вызвать сразу несколько методов:
         */
        LocalDateTime currentDateTime1 = LocalDateTime.now();
        System.out.println("Сейчас " + currentDateTime1);

        LocalDateTime newDateTime = currentDateTime1.plusMonths(3).plusWeeks(2);
        System.out.println("Через три с половиной месяца будет " + newDateTime);


    }
}
