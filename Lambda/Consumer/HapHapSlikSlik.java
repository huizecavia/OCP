package Lambda.Consumer;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class HapHapSlikSlik {
    
    public static void main (String[] args) {

        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;

        b1.accept("Chicken", 7);
        b1.accept("Dog", 2);

        System.out.println(map);

    }
}
