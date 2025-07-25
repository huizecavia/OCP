package Lambda.weer;

public class GeefWeer {

    public String geefVoorspelling(String voorspelling) {
        WeerInterface wi = (w) -> "Voorspelling: " + w;
        return wi.getWeer(voorspelling);
    }


    public static void main(String[] args) {
        System.out.println(new GeefWeer().geefVoorspelling("Zoiets"));
    }
}
