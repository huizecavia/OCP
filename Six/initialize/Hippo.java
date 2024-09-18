package Six.initialize;

public class Hippo extends Animal {

    public static void main(String[] args) {
        System.out.println("C");
        new Hippo();
        new Hippo();
        new Hippo();
    }
    static {
        System.out.println("B");
    }
}
