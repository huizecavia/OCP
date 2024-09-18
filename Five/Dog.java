package Five;

public class Dog {

    int a = 1;
    StringBuilder b = new StringBuilder("B");

    public static void speak (StringBuilder s) {
        s.append("Sandwichspread");
    }

    public void print(Dog d) {
        System.out.println(d.a);
        d.a = 5;
        b.append("C");
        System.out.println(b);
    }

    public static void main(String[]args) {
        var name = new StringBuilder("Heinz ");
        speak(name);
        System.out.println(name);
        Dog d = new Dog();
        d.print(d);
        System.out.println(d.b);
        Dog d2 = new Dog();
        System.out.println(d2.b);

    }
}
