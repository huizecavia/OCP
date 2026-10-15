package Five;

public class RunS {
    
    public static void main(String[] args) {
        Snake s1 = new Snake();
        s1.hiss = 10;
        System.out.println(s1.hiss);
        Snake s2 = new Snake();
        s2.hiss = 15;
        System.out.println(s1.hiss);
        Snake s3 = null;
        s3.hiss = 20;
        System.out.println(s1.hiss);



    }

}
