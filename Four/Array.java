package Four;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        String[] a = {"O", "C", "P"};
        String[] b = new String [4];
        b[3] = "Q";

        var numbers = new int[3];
        numbers[numbers.length - 1] = 2;
        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = i + 5;
        }

        java.util.Arrays.sort(a);
        for (String i: a) {
            System.out.println(i);
        }

        Integer[] getallen = {4,8,9,1};
        for (Integer i: getallen) {
            i = i + 5;
            System.out.println(i);
        }
        for (Integer i: getallen) {
            System.out.println(i);
        }

        System.out.println("---------------------");
        int[] q = {1, 3, 5};
        System.out.println(Arrays.binarySearch(q, 0));
        System.out.println(Arrays.binarySearch(q, 1));
        System.out.println(Arrays.binarySearch(q, 2));
        System.out.println(Arrays.binarySearch(q, 3));
        System.out.println(Arrays.binarySearch(q, 5));
        System.out.println(Arrays.binarySearch(q, 6));

        System.out.println("---------------------");
        int[] q2 = {1, 5, 3};
        System.out.println(Arrays.binarySearch(q2, 0));
        System.out.println(Arrays.binarySearch(q2, 1));
        System.out.println(Arrays.binarySearch(q2, 2));
        System.out.println(Arrays.binarySearch(q2, 3));
        System.out.println(Arrays.binarySearch(q2, 5));
        System.out.println(Arrays.binarySearch(q2, 6));

        System.out.println("comparecomparecomparecomparecomparecomparecomparecomparecompare");
        System.out.println(Arrays.compare(new Integer[] {2,0, 3,0}, new Integer[] {2,0,null,3,4}));       // 1
        System.out.println(Arrays.compare(new String[] {"A", "B", "C"}, new String[] {"A", "c", "C"}));   // -33
        System.out.println(Arrays.compare(new String[] {"A", "B", "C"}, new String[] {"A", "B", "C"}));   // 0
        System.out.println(Arrays.compare(new String[] {"A", "B", "C"}, new String[] {"Q", "B", "C"}));   // -16
        System.out.println("missssssssssssssssssssssssss");
        System.out.println(Arrays.mismatch(new Integer[] {2,0, 3,0}, new Integer[] {2,0,null,3,4}));        // 2
        System.out.println(Arrays.mismatch(new String[] {"A", "B", "C"}, new String[] {"A", "c", "C"}));    // 1
        System.out.println(Arrays.mismatch(new String[] {"A", "B", "C"}, new String[] {"A", "B", "C"}));    // -1
        System.out.println(Arrays.mismatch(new String[] {"A", "B", "C"}, new String[] {"Q", "B", "C"}));    // 0
        System.out.println("-------------------------");
        int[]ra = {1,3,2};
        System.out.println(ra.length);


        String[] w1 = {"A", "B", "C"};
        String[] w2 = {"A", "B", "C"};
        System.out.println(w1.equals(w2));

        String[] strings = {"Hoi"};
        Object[] objects = strings;
        String[] backToStrings = (String[]) objects;
//        objects[0] = new StringBuilder();





    }
}
