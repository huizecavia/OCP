package Lambda;

interface Speak {
    void say(String msg);
}

class SpeakHelper {
    static void saySomething(String msg, Speak sp) {
        sp.say(msg);

    }
}

public class MethRef {

    public static void main(String[] args) {

        SpeakHelper.saySomething("Huh?", System.out::println);

    }

}
