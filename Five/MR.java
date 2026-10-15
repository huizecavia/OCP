package Five;

public class MR {
    String name = "S";
    public static void first() {
    }

    public static void second() {
    }

    public void third() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        first();
        second();
        new MR().third();
    }
}
