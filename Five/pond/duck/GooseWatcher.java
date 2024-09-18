package Five.pond.duck;

import Five.pond.shore.Bird;
import Five.pond.swan.Goose;

public class GooseWatcher extends Bird {

    public void watch() {
        GooseWatcher goose = new GooseWatcher();
        goose.floatInWater();
    }
}
