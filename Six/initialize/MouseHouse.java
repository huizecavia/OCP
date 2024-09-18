package Six.initialize;

public class MouseHouse {

    private final int volume;
    private final String type;

    {this.volume = 11;}

    public MouseHouse(String type) {
        this.type=type;
    }

    public MouseHouse(){
        this(null);
    }


}
