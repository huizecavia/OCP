package Four;

public class multiArray {

    public static void main(String[] argh) {

        int[][] a2a = {{1,2}, {2,3}};
        int a2b[][] = {{4,3}, {2,0}};
        int[] vars[], space[][];
        vars = new int[][]{{4,5},{9,9}};
        space = new int[][][]{{{2,3}},{{2}}};
        String[][] rect = new String[3][2];
        System.out.println(rect.length);
        System.out.println(rect[0].length);
        System.out.println(rect[2].length);
        if (rect[0].length == 2) {
            System.out.println("Hoi");
        }

        char[][] twod = {{'a','b','c'}, {'1', '2', '3'}};
        for (char[] cc: twod) {
            for (char c: cc) {
                System.out.println(c+1);
            }
        }

        System.out.println(Math.min(1,4));
        System.out.println(Math.min(1.1f,4));
        var min = Math.min(1.1f,4d);
        System.out.println(Math.round(9.5));
        System.out.println(Math.ceil(9));
        System.out.println(Math.ceil(9.000));
        System.out.println(Math.ceil(9.001));
        System.out.println(Math.floor(9.9999));

        System.out.println(Math.pow(2,8));
        System.out.println(Math.pow(2,-8));
        System.out.println(Math.pow(3.14,-8.3));
        System.out.println(Math.random());
        System.out.println(Math.random());

    }
}
