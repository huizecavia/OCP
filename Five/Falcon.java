package Five;

public class Falcon {

    public void fly(int numMiles){}
    public void fly(short numFeet){}
    public boolean fly() {return false;}
    void fly(int numMiles, short numFeet) {}
    public void fly(short numFeet, int numMiles){}

    public String fly(char a) {
        return "";
    }

    public static void print(Integer i) {
        System.out.println("Integer");
    }

    public static void print(Double a) {
        System.out.println("Double");
    }

    public static void print(Object o) {
        System.out.println("Objection! " + o.toString());
    }

    public static void fly(double a) {}

    public static void main(String[] args) {

        var a1 = (Integer) 2;
        var a2 = (Double) 2d;
        var a3 = (Object) 2f;

        print(a1);
        print(a2);
        print(a3);

    }
}
