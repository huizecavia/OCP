package Five;

public class Snake {

    static long hiss = 2;
    long hoi = 5;

    public static void main(String[] args) {
        hiss = 3;
        System.out.println(hiss);
        Snake s = new Snake();
        s.hiss = 4;
        System.out.println(hiss);
        s.hoi = 67;
        System.out.println(s.hoi);
        s = null;
        System.out.println(hiss);
        System.out.println(s.hoi);
    }
}
