package Three;

public class Loop {

    public static void main(String[] args) {

        // break
        // break met label
        // continue
        // continue met label



        for (int i = 1; i < 4; i++) {
            LL:for (int j = 4; j < 7; j++) {
                for (int k = 8; k < 10; k++) {
                    if (k == 9) break LL;
                    System.out.println("" + i + j + k);

                }
            }
        }

    }
}
