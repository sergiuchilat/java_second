package datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime =  LocalDateTime.now();
        System.out.println(localDateTime);

        localDate = LocalDate.of(2020, 10, 8);
        System.out.println(localDate);

        System.out.println(LocalDate.parse("2020-10-08"));

        System.out.println(LocalDate.now().plusDays(22));
        System.out.println(LocalDate.now().plusYears(-5));
        System.out.println(LocalDate.now().plusYears(-3000).getEra());

        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println(LocalDate.now().getDayOfWeek().getValue());

        System.out.println(LocalDate.now().isBefore(LocalDate.of(2020, 1, 4)));
        System.out.println(LocalDate.now().isBefore(LocalDate.of(2020, 11, 4)));

        LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
        LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12")
                .with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDayOfMonth);

        System.out.println(TemporalAdjusters.firstDayOfMonth());
        System.out.println(TemporalAdjusters.lastDayOfMonth());

        LocalTime sixThirty = LocalTime.parse("06:30");
        System.out.println(sixThirty);
        System.out.println(LocalTime.now());

        LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);
        System.out.println(sevenThirty);
        System.out.println(sevenThirty.getHour());

        LocalTime maxTime = LocalTime.MAX;
        System.out.println(maxTime);

        System.out.println(LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30));

        System.out.println(LocalDateTime.parse("2015-02-20T06:30:00"));

        System.out.println(ZoneId.of("Europe/Paris"));
        System.out.println(ZoneId.systemDefault());

        System.out.println(ZoneId.getAvailableZoneIds());

        System.out.println(ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]"));
        System.out.println(ZoneOffset.of("+02:00"));
        System.out.println(OffsetDateTime.of(localDateTime,ZoneOffset.of("+02:00")));
        System.out.println(LocalDate.parse("2007-05-10").plus(Period.ofDays(5)));

        System.out.println(Period.between(LocalDate.now(), LocalDate.parse("1984-07-23")));
        System.out.println(Period.between(LocalDate.now(), LocalDate.parse("1984-07-23")).getDays());
        System.out.println(ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.parse("1984-07-23")));
        System.out.println(ChronoUnit.MONTHS.between(LocalDate.now(), LocalDate.parse("1984-07-23")));
        System.out.println(ChronoUnit.YEARS.between(LocalDate.now(), LocalDate.parse("1984-07-23")));
        System.out.println(ChronoUnit.ERAS.between(LocalDate.now(), LocalDate.parse("1984-07-23")));
        System.out.println(ChronoUnit.SECONDS.between(LocalDate.now(), LocalDate.parse("1984-07-23")));

        System.out.println(LocalTime.of(6, 30, 0).plus(Duration.ofSeconds(30)));








    }
}
