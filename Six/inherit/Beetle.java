package Six.inherit;

class Insect {
    protected int numberOfLegs = 4;
    String label = "buggy";
}

public class Beetle extends Insect {
    private final Six.inherit.Insect Insect;
    protected int numberOfLegs = 6;
    short age = 3;

    public Beetle(int Int, Integer integer, Insect insect) {
        this.Insect = insect;
    }

    public void printData() {
        System.out.println(this.label);
        System.out.println(super.label);
        System.out.println(this.age);
//        System.out.println(super.age);
        System.out.println(numberOfLegs);
    }

    public static void main(String[] args) {
        new Beetle(0, null, null).printData();
    }

}
