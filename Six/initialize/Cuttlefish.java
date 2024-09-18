package Six.initialize;

public class Cuttlefish {

    { COUNT++; System.out.println(COUNT);}
    private String name = "swimmy";
    {System.out.println(name);}
    private static int COUNT = 0;
    static {System.out.println(COUNT);}

    public Cuttlefish() {
        System.out.println("Construct");
    }

    public static void main(String[] args){
        System.out.println("Ready");
        new Cuttlefish();
    }
}
