package Seven;

interface Olly {
    int a = 11;
    default int getal() {
        return 1;
    }
}

class Molly implements Olly {
    int a = 12;
    public int getal() {
        return 2;
    }
}

class Wolly extends Molly {
    int a = 13;
    public int getal() {
        return 3;
    }
}


public class Dolly extends Wolly {

    int a = 14;

    @Override
    public int getal() {
        return 4;
    }

    public static void main(String[] aaarrrrgghh) {

        Dolly dolly = new Dolly();
        System.out.println(dolly.getal() + " / " + dolly.a);

        Wolly wolly = new Wolly();
        System.out.println(wolly.getal() + " / " + wolly.a);

        Molly molly = new Molly();
        System.out.println(molly.getal() + " / " + molly.a);

        Olly olly = new Dolly();
        System.out.println(olly.getal());

        Molly mollyd = new Dolly();
        System.out.println(mollyd.getal() + " / " + mollyd.a);

        Wolly wollyd = new Dolly();
        System.out.println(wollyd.getal() + " / " + wollyd.a);
    }

    
}
