package Six.initialize;

public class Chimpanzee extends Ape{
    public Chimpanzee() {
        super(2);
        System.out.print("Chimp-");
    }

    public static void main(String ... args) {
        new Chimpanzee();
    }
}
