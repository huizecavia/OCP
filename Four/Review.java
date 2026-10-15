package Four;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;

public class Review {

    public static void main(String[] args) {

        var s = "Hello";
        var t = new String(s);
        if ("Hello".equals(s)) System.out.println("one");
        if (t == s) System.out.println("two");
        if (t.intern() == s) System.out.println("three");
        if ("Hello" == s) System.out.println("four");
        if ("Hello".intern() == t) System.out.println("five");

        var pool1 = "pool";
        var pool2 = "pool";
        System.out.println(pool1 == pool2);
        System.out.println(pool1.intern() == pool2);
        var buiten1 = new String("pool");
        System.out.println(buiten1 == pool1);
        System.out.println(buiten1.intern() == pool1);
        System.out.println(buiten1 == pool1.intern());
        System.out.println(buiten1.equals(pool1.intern().intern()));


        var sb = new StringBuilder();
        sb.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb);

        // double one = Math.pow(1, 2);
        // int two = Math.round(1.0);
        // float three = Math.random();
        // var doubles = new double[] {one, two, three};

        var string = "12345";
        var builder = new StringBuilder("12345");
        System.out.println(builder.replace(2, 4, "6"));
        System.out.println(builder.replace(2, 5, "6"));
        System.out.println(string.length());
        var a = new int[3];
        var b = a.length;

        System.out.println(string.replace("123", "1").charAt(2));

        // 2025–08–28T05:00 GMT-04:00
        // 2025–08–28T09:00 GMT-06:00

        var zone1 = java.time.ZoneId.of("America/New_York");
        var zone2 = java.time.ZoneId.of("America/Los_Angeles");
        var localDateTime1 = java.time.LocalDateTime.of(2025, 8, 28, 6, 0);
        var localDateTime2 = java.time.LocalDateTime.of(2025, 8, 28, 9, 0);

        var dt1 = ZonedDateTime.of(localDateTime1, zone1);
        var dt2 = ZonedDateTime.of(localDateTime2, zone2);
        System.out.println(dt1);
        System.out.println(dt2);


// The first element is index 0.        T
// The first element is index 1.
// Arrays are fixed size.               T
// Arrays are immutable.                
// Calling equals() on two different arrays containing the same primitive values always returns true.   
// Calling equals() on two different arrays containing the same primitive values always returns false.
// Calling equals() on two different arrays containing the same primitive values can return true or false.   T


        int one = Math.min(5, 3);
        long two = Math.round(5.5d);
        double three = Math.floor(6.6);
        var doubles = new double[] {one, two, three};



        // var date = LocalDate.of(2025, 4, 3);
        // date = date.plusDays(2);
        // // date = date.plusHours(3);
        // System.out.println(date.getYear() + " " + date.getMonth()
        //     + " " + date.getDayOfMonth());


        var numbers = "012345678".indent(1);
        System.out.println(numbers + "a");
        numbers = numbers.stripLeading();
        System.out.println(numbers);
        System.out.println(numbers.substring(1, 3));
        System.out.println(numbers.substring(7, 7));
        System.out.println(numbers.substring(7, 8));
        System.out.println(numbers.substring(7, 10));
        System.out.println(numbers.substring(8, 10));   // 9 + line break = 10
        System.out.println(numbers.substring(7));    


        var date = LocalDate.now();
        var time = LocalTime.now();
        var dateTime = date.atTime(time);
        System.out.println(dateTime);
        var zoneId = ZoneId.systemDefault();
        var zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
        Instant instant = zonedDateTime.toInstant();
        System.out.println(instant);

        var arr = new String[] { "PIG", "pig", "123"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, "Pippa"));

        var letters = new StringBuilder("abcdefg");
        System.out.println(letters.substring(2, 6));

        // String s1 = """
        //     purr""";
        // System.out.println(s1.length());   // just a normal string
        // String s2 = "";
        // s1.toUpperCase();
        // s1.trim();
        // s1.substring(1, 3);
        // s1 += "two";
        // s2 += 2;
        // s2 += 'c';
        // s2 += false; // dat mag dus
        // if ( s2.intern() == "2cfalse") System.out.println("==");
        // if ( s2.equals("2cfalse")) System.out.println("equals");
        // System.out.println(s1.length());

        String[] s1 = { "Camel", "Peacock", "Llama"};
        String[] s2 = { "Camel", "Llama", "Peacock"};
        String[] s3 = { "Camel"};
        String[] s4 = { "Camel", null};
        System.out.println(Arrays.mismatch(s4, s4));

    }

}
