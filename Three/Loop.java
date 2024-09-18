package Three;

public class Loop {

    public static void main(String[] args) {

        // break
        for (int i = 1; i < 4; i++) {
            LL:for (int j = 4; j < 7; j++) {
                for (int k = 8; k < 10; k++) {
                    if (k == 9) break LL;
                    System.out.println("" + i + j + k);
                }
            }
        }


        // continue
        for (int i = 1; i < 4; i++) {
            for (int j = 4; j < 7; j++) {
                for (int k = 8; k < 10; k++) {
                    if (k == 9) continue;
                    System.out.println("" + i + j + k);
                }
            }
        }


        CLEANING: for (char stables = 'a'; stables < 'd'; stables++) {
            for (int leopard = 1; leopard<4; leopard++) {
                if (stables == '2' || leopard==2) {
                    break;   // bij leopard 2 wordt 2 en de rest (3) overgeslagen
                }
                System.out.println("Cleaning:" + stables + " " +leopard);
            }
        }

        CLEANING: for (char stables = 'a'; stables < 'd'; stables++) {
            for (int leopard = 1; leopard<4; leopard++) {
                if (stables == '2' || leopard==2) {
                    continue;  // bij leopard 2 wordt 2 overgeslagen
                }
                System.out.println("Cleaning:" + stables + " " +leopard);
            }
        }

    }
}
