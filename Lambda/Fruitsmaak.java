package Lambda;

public class Fruitsmaak {

    public String geefSmaak(String vrucht) {

        FruitInterface fruitInterface2 = (s) -> (s + " = lekker!");
        return fruitInterface2.getSmaak(vrucht);
    }
    
}
