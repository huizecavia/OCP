package Lambda.Consumer;

import java.util.function.Consumer;

public class HapSlik {
    
    public static void main(String[] args) {
        
        Consumer<String> eetAlles = (s) -> System.out.println(s + " opgegeten");
        eetAlles.accept("Sla");
    }
}
