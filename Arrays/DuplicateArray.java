//make a duplicate array i.e. copy all elements from a1 to a2.

import java.util.Arrays;

public class DuplicateArray {

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] a2 = new int[10];

        //copying all elements from a1->a2.

        for (int i=0; i<a1.length; i++){
            a2[i] = a1[i];
        }

        System.out.println("elements of a2 are >>");
        System.out.println(Arrays.toString(a2));

    }
}
