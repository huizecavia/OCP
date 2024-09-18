package FiveSide;

import java.util.Arrays;

public class PolarBear {

    final int age = 10;
    final int fishEaten;
    final String name;

    {fishEaten = 0;}

    public PolarBear() {
        name = "";
    }

    public void nee() {
        final int a;
        final String b;
    }

    public void varargs(int a, int  ...b) {
    }

    public static void varargs2(int ... c){
        System.out.println(c[2] + "," +  c.length);
    }

    public void roep() {
        int[] q= {1,2,3};
        varargs(3, q);
        varargs2(1,2,3);
        varargs2();
    }

    public static void main(String[] args) {
        varargs2(55,11,44);




    }



}
