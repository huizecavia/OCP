package Six.inherit;

public class Zebra extends Animal {

    public Zebra(int age) {
        super(age);
    }

    public Zebra() {
        this(4);
    }

    public Zebra(String a) {
        super(5);
//        super();
    }

    public void hoi() {
        System.out.println(super.getAge());
    }
}
