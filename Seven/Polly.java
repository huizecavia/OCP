package Seven;

interface I1 {
    int getal1();
}
interface I2 extends I1 {
    int getal2();
}

abstract class C1 implements I2 {
    String naam1() {
        return "A";
    }

    public int getal1() {
        return 1;
    }

    public int getal2() {
        return 2;
    }
}


abstract class C2 extends C1 {
    String naam1() {
        return "AA";
    }

    public int getal1() {
        return 11;
    }

    public int getal2() {
        return 22;
    }    
    
    String naam2() {
        return "BB";
    }
}


public class Polly extends C2 {

    String naam1() {
        return "AAA";
    }

    public int getal1() {
        return 111;
    }

    public int getal2() {
        return 222;
    }    
    
    String naam2() {
        return "BBB";
    }

    public static void main(String... args) {

        Polly polly = new Polly();
        System.out.println(polly.getal1() + " / " + polly.getal2() + " / " + polly.naam1() + " / " + polly.naam2());

        C2 c2 = new Polly();
        System.out.println(c2.getal1() + " / " + c2.getal2() + " / " + c2.naam1() + " / " + c2.naam2());

        C1 c1 = new Polly();
        System.out.println(c1.getal1() + " / " + c1.getal2() + " / " + c1.naam1());

        I2 i2 = new Polly();
            System.out.println(i2.getal1() + " / " + i2.getal2());

        I1 i1 = new Polly();
        System.out.println(i1.getal1());

    }
    
}
