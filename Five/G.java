package Five;

public class G {

    public void rest(Long x) {
        System.out.println("Long");
    }

    public static void main(String[] args) {
        var g = new G();
        g.rest(8L);
    }
}
