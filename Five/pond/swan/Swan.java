package Five.pond.swan;

import Five.pond.shore.Bird;

public class Swan extends Bird {

    public void swim() {
        floatInWater();
        System.out.println(text);
    }

    public void helpOtherSwans() {
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherBirds() {
        Bird other = new Bird();
//        other.floatInWater();

        Swan gek = (Swan) new Bird();
        gek.floatInWater();

        Bird gek2 = new Swan();
//        gek2.floatInWater();

    }
}
