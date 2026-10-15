package Seven;



public class Instance {
    int getal = 1;

    public static void main(String[] args) {
        Instance i = new Instance();
        System.out.println(i.getal);

        Ins1 i1 = new Ins1();
        System.out.println(i1.getal);

        Ins2 i2 = new Ins2();
        System.out.println(i2.getal);

        Ins2 i21 = (Ins2) new Instance();  // not related!! 
        System.out.println(i21.getal);

    }

}

class Ins1 extends Instance {
    int getal = 2;
}

class Ins2 extends Instance {
    int getal = 3;
}
