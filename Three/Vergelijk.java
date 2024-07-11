package Three;

public class Vergelijk {

    void compareIntegers(Number number) {
        if (number instanceof Integer) {
            Integer data = (Integer) number;
            System.out.println(data.compareTo(5));
        }
    }

    void compareIntegersPattern(Number number) {
        if (number instanceof Integer data) {
            System.out.println(data.compareTo(3));
        }

        if (number instanceof Integer data10 && data10.compareTo(10) > 0) {
            System.out.println("groter dan 10");
            // || ipv && vindt ie niet fijn
        }

        if (number instanceof Number) {
            System.out.println("komt hier nooit");
        }

        Integer number2 = number.intValue();

        if (number2 instanceof Integer) {
            // data erachter vindt ie niet fijn als gelijke typen
        }

        if (number instanceof Integer data2) {
            System.out.println(data2.intValue());
            int b = data2;
        }
//        int b = data2;    neen
        if (!(number instanceof Integer data3)) {
            return;
        }
        data3.intValue();


    }


    public static void main(String[] args) {
        Vergelijk v = new Vergelijk();
        v.compareIntegers(3);
        v.compareIntegersPattern(15);

    }
}
