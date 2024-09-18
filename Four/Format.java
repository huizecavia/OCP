package Four;

public class Format {

    public static void main(String[] args) {

        String name = "Wie?";
        int orderId = 5000000;
        float drijf = 22.5555f;
        double dubbel = 5323423.00330;

        System.out.println("Hello " +name+" your order "+orderId+" is ready");
        var f = String.format("Hello %s your order %d is ready", name, orderId);
        System.out.println(f);
        var g = "Hoi %s over %n%10d in %n%010.2f naar %f %n nieuwe regel %n%n twee nieuwe regels".formatted(name, orderId, drijf, dubbel);
        System.out.println(g);

        var h = " aNiMal    ";
        System.out.println(h.trim().toLowerCase().replace('a', 'A') + "|");

        StringBuilder a = new StringBuilder();
        for (int i='a'; i<= 'z'; i++) {
            a.append(i);
        }
        System.out.println(a);

        var b = a.append("Nee");
        b.append("Wel");
        System.out.println(a);
        System.out.println(b);
        a=new StringBuilder("Niets");
        System.out.println(a);
        System.out.println(b);

        var d = 1;
        StringBuilder klein = new StringBuilder(d);
        klein.append("Veeeeeeeeeeeeeeeeeeeeeeeel meeeeeeeeeeeeeeeeeeer haaaaaaaaaaaaahaaaaaaaaaaaaaahaaaaaaaaaaaa");
        System.out.println(klein);

        var sb = new StringBuilder("animals");
        String ss = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        System.out.println(sb);
        System.out.println(ss);

        boolean wacht = true;
        int getal = 5;
        String hello = "Hoi";
        var StringBuilder = new StringBuilder("Hallo");
        StringBuilder.append(wacht).append(getal).append(hello);
        System.out.println(StringBuilder);
        StringBuilder.insert(6,"Even iets tussendoor");
        System.out.println(StringBuilder);
        StringBuilder.delete(4,6);
        StringBuilder.deleteCharAt(9);
        System.out.println(StringBuilder);
        StringBuilder.replace(11, 15, "Lalalalala");
        System.out.println(StringBuilder);
        StringBuilder.reverse();
        System.out.println(StringBuilder);
    }
}
