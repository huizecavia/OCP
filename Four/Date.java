package Four;

import java.time.*;

public class Date {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
        System.out.println(LocalDate.of(-100,1,1));
        System.out.println(LocalTime.now());
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.of(1,2,3,4));
        System.out.println(LocalDateTime.MAX);
        System.out.println(ZonedDateTime.now());
        var q = Month.JANUARY;
        System.out.println(q.getValue());
        var w = LocalDate.of(2000,1,29);
        System.out.println(w);

        var date = LocalDate.of(2000, 10, 15);
        var time = LocalTime.of(0,0,1);
        var datetime = LocalDateTime.of(date, time);
        System.out.println(datetime);

        var zone = ZoneId.of("US/Eastern");
        var dated = LocalDate.now();
        var timed = LocalTime.now();
        var zoned1 = ZonedDateTime.of(dated, timed, zone);
        System.out.println(zoned1);
        var zoned2 = zoned1.plusMonths(5);
        System.out.println(zoned1);
        System.out.println(zoned2);


    }
}
