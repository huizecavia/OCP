package One;

public class Types {

    boolean primitive;
    double v1 = 12d;

    public static void main (String[] args) {

        double d = 12.3D;
        long l = 123l;
        float f = 1e22F;

        System.out.println(d + l + f);

        byte a = 017;
        byte b = 034;

        System.out.println(a + b);

        String oldschool = "\"Hallo!\"\nHier zijn we!";
        System.out.println(oldschool);
        String tekstblok = """
                Jaaa!!\
                Dus""";
        System.out.println(tekstblok);
        System.out.println(tekstblok);

        int _1 = 15;
        System.out.println(_1);

        int $creflo = 0;

        Types type = new Types();
        System.out.println(type.primitive);

        int v1
                =1;
        var v2
                =1;


    }
}
