package Four;

public class Strings {

    public static void main(String[] args) {

        {var index= 1;}

        String a = "animals}";
        System.out.println(a.indexOf('a'));
        System.out.println(a.indexOf("a",3));
        System.out.println(a.indexOf(125));

        System.out.println("Hallo".startsWith("H"));
        System.out.println("Hallo".startsWith("h"));
        System.out.println("Hallo".contains("l"));

        System.out.println("Lalalalala".replace('a', 'b'));
        System.out.println("Lalalalala".replace("l", "D"));
        System.out.println("  jog   o e r  gio   \u2000".strip() + "//");
        System.out.println("  jog   o e r  gio   \u2000".trim() + "//");
        System.out.println("  jog   o e r  gio   \u2000".stripLeading() + "//");
        System.out.println("  jog   o e r  gio   \u2000".stripTrailing() + "//");
        System.out.println("\ta b c\n");
        System.out.println("\ta b c\n".trim());
        System.out.println(" abc\t ".stripLeading().length());
        System.out.println(" abc\t ".stripTrailing().length());

        String tekstblok = """
                       lalala
                     jajajaja
                            nee nee nee""";
        System.out.println(tekstblok);
        System.out.println(tekstblok.indent(10));
        System.out.println(tekstblok.indent(-10));
        System.out.println(tekstblok.stripIndent());

        var block = """
                a
                 b
                c""";

        var concat = " a\n" + "  b\n" + " c";
        System.out.println(block.length());
        System.out.println(block.indent(0).length());
        System.out.println(block.indent(1).length());
        System.out.println(block.indent(-1).length());
        System.out.println(concat.length());
        System.out.println(concat.indent(0).length());
        System.out.println(concat.indent(1).length());
        System.out.println(concat.indent(-1).length());
        System.out.println(concat.indent(-4).length());

        System.out.println("Hoi\nNee\"hihi\"'lala'dada'nou\tHuu\'uu".translateEscapes());
        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println("\n\t\t".isBlank());
        System.out.println("\n\t\t".isEmpty());

        System.out.println("----------------------");
        var y = "Hallo";
        var z = "Hallo ";
        System.out.println(y == z);
        System.out.println(y.equals(z));
        System.out.println(y.equals(z.trim()));
        System.out.println(y = z);
        System.out.println(y == z);
        var sz = new StringBuilder("Hallo");
        System.out.println(y.equals(sz));

        var a1 = "Q";
        var a2 = "Q";
        var a3 = "Q ";
        var a4 = a3.trim();
        a4 = "Q";
        System.out.println(a1 == a2);
        System.out.println(a1 == a3);
        System.out.println(a1 == a4);
        String a5 = new String("Q");
        String a6 = a5.intern();
        System.out.println(a1 == a5);
        System.out.println(a1 == a6);
        System.out.println("//////////////////////");

        var first = "rat" + 1;
        var second = "r" + "a" + "t" + "1";
        var third = "r" + "a" + "t" + new String("1");
        System.out.println(first == second);                // true true false  true
        System.out.println(first == second.intern());
        System.out.println(first == third);
        System.out.println(first == third.intern());




    }
}
