package Six.initialize;

public class ZooTickets {

    private String name = "BestZoo";
    {System.out.print(name + "-");}
    private static int COUNT = 0;
    static {COUNT += 10;
        System.out.print(COUNT + "-");}
    static {System.out.print(COUNT + "-");}

    public ZooTickets() {
        System.out.print("z-");
    }

    static {COUNT += 10;
        System.out.print(COUNT + "-");}


    public static void main(String... patrons) {
        new ZooTickets();
    }

    static {COUNT += 10;
        System.out.print(COUNT + "-");}

}
