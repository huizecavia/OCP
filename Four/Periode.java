package Four;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Periode {

    public static void main(String[] args) {

        var start = LocalDate.of(2022, Month.JANUARY, 1);
        var end = LocalDate.of(2022, Month.MARCH, 30);
        var period = Period.ofMonths(1);
        performAnimalEnrichment(start, end, period);


        var period107 = Period.of(1,0,7);
        var period11 = Period.ofYears(1).ofWeeks(1);
        System.out.println(period107);
        System.out.println(period11);

        var durable1 = Duration.of(1, ChronoUnit.DAYS);
        var durable2 = Duration.ofDays(2);
        System.out.println(durable1);
        System.out.println(durable2);
        var durable3 = Duration.ofSeconds(1000000000);
        System.out.println(durable3);
        var durable4 = Duration.of(3, ChronoUnit.HALF_DAYS);
        System.out.println(durable4);
        var loco1 = LocalTime.of(1,4,5);
        var loco2 = LocalTime.of(10,10,10);
        System.out.println(ChronoUnit.MINUTES.between(loco1, loco2));
        Period p = Period.of(1,2,3);
        Duration d = Duration.of(23, ChronoUnit.HOURS);
        loco2 = loco1.plus(d);
        System.out.println(loco2);

        var nu = LocalTime.now();
        var ooknu = LocalTime.now();
        System.out.println(Duration.between(nu, ooknu).toNanos());

        var instantkoffie = Instant.now();
        var zoned = ZonedDateTime.now();
        var ontzoned = zoned.toInstant();
        System.out.println(zoned);
        System.out.println(zoned.getOffset());
        System.out.println(ontzoned);

    }
    public static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        var upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give " + upTo);
            upTo = upTo.plus(period);
        }
    }
}
