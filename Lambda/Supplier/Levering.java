package Lambda.Supplier;

import java.util.function.Supplier;

public class Levering {

    public static void main (String[] args) {
        Supplier<Integer> levering = () -> 25;
        System.out.println(levering.get());
    }    
 }
