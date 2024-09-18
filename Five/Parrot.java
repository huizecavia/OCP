package Five;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Parrot {

    public static void print(List<Integer> i) {
        System.out.print("I");
    }

    public static void print(CharSequence c) {
        System.out.print("C");
    }

    public static void print(Object o) {
        System.out.print("O");
    }

    public static void print(Integer i) {
        System.out.println("Integer");
    }

    public static void print(int i) {
        System.out.println("int");
    }

    public void fly1(int[] lengths){}
    public void fly2(int... length){}

    public static void main(String[] args) {
        print("abc");
        print(Arrays.asList(3));
        print(LocalDate.of(2019,4,2));
        print(1);
        print((Integer) 1);

        Parrot p = new Parrot();
        p.fly1(new int[] {1,2,3});
        p.fly2(new int[] {1,2,3});
        p.fly2(1,2,3);
//        p.fly1(1,2,3);

    }
}
