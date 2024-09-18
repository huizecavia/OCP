package Five;

public class Pelican {

    public void fly(String s) {
        System.out.print("String");
    }

    public void fly(Object o) {
        System.out.print("Objection");
    }

    public static void main(String[] args) {
        var p = new Pelican();
        p.fly("T");
        System.out.print("-");
        p.fly(56);
    }
}
