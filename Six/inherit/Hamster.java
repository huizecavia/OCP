package Six.inherit;

public class Hamster {

    String color;
    int weight;
    public Hamster(int weight, String color){
        this.weight = weight;
        this.color = color;
    }
    public Hamster(int weight) {
        this(weight, "TRANS");
    }

    public static void main(String[] args){
        System.out.println(new Hamster(1).weight + new Hamster(1).color);
        System.out.println(new Hamster(1, "A").weight + new Hamster(1, "A").color);
    }

}
