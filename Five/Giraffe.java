package Five;

public class Giraffe {

    public void eat (Giraffe g) {
        drink();
        allGsOnHold();
        allGsGoHome(new Giraffe());
    }
    public void drink(){}
    public static void allGsGoHome(Giraffe g) {
        allGsOnHold();
        new Giraffe().drink();
//        drink();
        new Giraffe().eat(new Giraffe());
    }
    public static void allGsOnHold() {}

    public static void main(String[] args) {
        allGsGoHome(new Giraffe());

    }
}
