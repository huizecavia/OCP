package Five;

public class Giraffe {
    public void eat(Giraffe g) {
        allGiraffeComeOut();
        g.allGiraffeComeOut();
        drink();
        // eat();
        g.eat(g);
    }

    public void drink() {};
    public static void allGiraffeGoHome(Giraffe g) {
        allGiraffeComeOut();
        new Giraffe().drink();
        g.eat(g);
    }


   public static void allGiraffeComeOut() {
        new Giraffe().eat(new Giraffe());   }


   public static void main(String[] args) {


   }
}
