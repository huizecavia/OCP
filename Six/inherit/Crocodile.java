package Six.inherit;

public class Crocodile extends Reptile {

    protected int speed = 10;
    public int getSpeed() {
        return super            .                 speed;
    }

    public static void main(String[] arghs) {
        var croc = new Crocodile();
        System.out.println(croc.getSpeed());
    }
}
