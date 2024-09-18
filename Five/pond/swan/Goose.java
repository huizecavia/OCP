package Five.pond.swan;

import Five.pond.shore.Bird;

public class Goose extends Bird {

    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
    }

    public void helpOtherGooseSwim() {
        Bird other = new Goose();
//        other.floatInWater();
    }
}
