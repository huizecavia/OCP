package Five;

public class Penguin {

    String name;
    static String tallest;

    public void niks() {
        this.name = "!!";
        this.tallest = "???";
    }

    public Penguin() {
//        this.tallest = "Init";
//        tallest = "INIT";
    }

    {tallest = "---";}

    public static void main(String[] args) {
        var p1 = new Penguin();
        p1.name="L";
        System.out.println(tallest);
        tallest = "?";
        System.out.println(tallest);

        var p2 = new Penguin();
        p2.tallest = "Mooi niet";
        p2.name = "ikke";

        System.out.println(p2.tallest);
        System.out.println(p2.name);
        System.out.println(p1.tallest);
        System.out.println(p1.name);

//        Penguin.main(new String[] {"A"});

    }
}
