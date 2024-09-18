package Six.inherit;

public class Flamingo {

    private String color = null;
    public void setColor(String color) {
        color = color;
    }
    public void setThisColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        var f = new Flamingo();
        f.setColor("J");
        System.out.println(f.color);
        f.setThisColor("J");
        System.out.println(f.color);
    }
}
