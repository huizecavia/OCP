package Lambda.weer;

public class GeefWeer {

    public String geefVoorspelling(String voorspelling) {
//        WeerInterface wi = (w) -> {if (w.equals("Zon")) return " Vreselijk"; else return "Te doen";};
        WeerInterface wi = (w) -> (w.equals("Zon") ? "Vreselijk" : "Te doen");
//        reverse ? (a, b) -> a - b : (a, b) -> b - a;
        return wi.getWeer(voorspelling);
    }


    public static void main(String[] args) {
        System.out.println(new GeefWeer().geefVoorspelling("Zop"));
    }
}
