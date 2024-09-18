package Six.inherit;

import java.util.Arrays;

public class Turtle {
    private String name;
    public Turtle() {
        name = "JD";
    }

    public Turtle(int age) {
        name="int";
    }

    public Turtle(String h) {
        name = "String";
    }

    public Turtle(Long age) {
        name = "Long";
    }

    public Turtle(String newname, String ... favoriteFoods){
        name = "Grill";
    }

    public static void main(String[] args) {
        System.out.println(new Turtle().name);
        System.out.println(new Turtle(1).name);
        System.out.println(new Turtle(1l).name);
        System.out.println(new Turtle(1L).name);
        System.out.println(new Turtle((String) null).name);
        System.out.println(new Turtle("Hoi").name);
        System.out.println(new Turtle(null, null).name);
        System.out.println(new Turtle("Hoi", new String[] {"A", "B"}).name);
        System.out.println(new Turtle(Arrays.toString(new String[] {"A", "B"}), "A").name);
    }

}
