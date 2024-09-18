package Five;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class Counter {

    private static int count;
    private static final int tel;
    public Counter() {
        count--;
//        tel = 1;
    }

    private static final int a1;
    private static final int a2;

    static {a2 = 1;
    a1 = a2;}

    private static final int a3;
    static {a3 = 1;}
    static {tel = 9;}

    private static int one;
    private static final int two;
    private static final int three = 3;
//    private static final int four;

    static {
        one =1;
        two = 2;
//        three = 3;
//        two = 4;
    }





    public static void main(String[]args) {
        Counter c4 = new Counter();
            Counter c5 = new Counter();
            Counter c6 = new Counter();
        System.out.println(count);

        List<String> a = asList("1", "2");
        List<String> b = Arrays.asList("1", "2");
        System.out.println(a);
    }



}
