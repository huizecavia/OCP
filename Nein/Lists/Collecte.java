package Nein.Lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Collecte {

    public static void main(String[] args) {
        
        Collection<String> collecte = new ArrayList<>();
        System.out.println(collecte.isEmpty());
        System.out.println(collecte.size());
        System.out.println(collecte.add("Aha"));
        System.out.println(collecte.isEmpty());
        System.out.println(collecte.size());
        System.out.println(collecte.add("Aha"));
        System.out.println(collecte.remove("Aha"));
        System.out.println(collecte.remove("Aha"));
        System.out.println(collecte.remove("Aha"));
        System.out.println("---------");
        Collection<String> hash = new HashSet<>();
        System.out.println(hash.add("Aha"));
        System.out.println(hash.add("Aha"));
        System.out.println(hash.isEmpty());
        System.out.println(hash.size());
        System.out.println(hash.remove("Aha"));
        System.out.println(hash.remove("Aha"));
        System.out.println("---------");
        hash.add("Nee");
        hash.add("Ja");
        hash.clear();
        System.out.println(hash.size());
        System.out.println("---------");

        collecte.add("AbC");
        collecte.add("aBc");
        collecte.add("QQc");
        collecte.add("QQC");
        System.out.println(collecte.contains("aBc"));
        System.out.println(collecte.contains("ABc"));
        collecte.removeIf(s5start-> s5start.endsWith("c"));
        System.out.println(collecte.toString());
        collecte.forEach(System.out::println);
        collecte.forEach(c -> System.out.println("lambda yeah: " + c));
    }
    
}
