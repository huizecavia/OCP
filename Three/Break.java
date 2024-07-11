package Three;

public class Break {

    public void niets(int niets) {
        switch(niets) {
        }
    }

    final int a1 = 1;

    public void nobreak(int niets) {
        switch(niets) {
            case a1: break;
            case 3^5: break;
            default: break;
        }
    }

    public int switch2_0(int hoi) {
        return switch(hoi) {
            case 0,1,2,3,4,5,6,7 -> 1;
            case 8 -> 4;
            default -> 0;
        };
    }

    public void switch3_divers(char a) {
        var b = switch(a) {
            case 'a' -> "Hoi";
            case 'b' -> 2;
            case 'c' -> new Break();
            default -> null;
        };
        System.out.println(b);
    }

    public void switch4_block(String q) {
        var c = switch(q) {
            case "Q" -> {char t; t = 'g'; t++; yield "Lalalala" + t;}
            case "W" -> "Jajajaja";
            default -> {yield "Null";}
        };
        System.out.println(c);
    }


    public static void main(String[] args) {

        System.out.println(3^9);
        Break breack = new Break();
        var a = breack.switch2_0(6);
        breack.switch3_divers('a');
        breack.switch3_divers('b');
        breack.switch3_divers('c');
        breack.switch3_divers('d');

        breack.switch4_block("Q");
        breack.switch4_block("W");
        breack.switch4_block("");
        boolean wacht = true;
    }
}
