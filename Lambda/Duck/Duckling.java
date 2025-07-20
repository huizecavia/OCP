package Lambda.Duck;

public class Duckling {

    public static void makeSound(String sound) {
//        Speak learner = s -> System.out.println(s);
        Speak learner = System.out::println;

        DuckHelper.teacher(sound, learner);
    }
}
