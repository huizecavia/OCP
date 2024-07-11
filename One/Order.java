package One;

public class Order {

    String a;

    {a = "1";}
    {a = "2";}
    {System.out.println(a);}

    public Order() {
        a = "3";
    }


    public static void main (String[] args) {
        Order order = new Order();
        boolean wacht = true;

    }
}
