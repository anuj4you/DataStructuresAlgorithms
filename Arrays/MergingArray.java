//merging 2 arrays with sorting.

import java.util.Arrays;

public class MergingArray {

    static int[] mergingArray(int[] a1, int[] a2) {
        int[] fa = new int[a1.length + a2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a1.length && j < a2.length) {

            if (a1[i] < a2[j]) {
                fa[k++] = a1[i++];
            } else {
                fa[k++] = a2[j++];
            }

        }
        for (; i < a1.length; i++) {
            fa[k++] = a1[i];
        }
        for (; j < a2.length; j++) {
            fa[k++] = a2[j];
        }
        return fa;
    }

    public static void main(String[] args) {

        int[] a1 = {2, 8, 16, 20, 90, 150};
        int[] a2 = {3, 4, 7, 40};

        System.out.println(Arrays.toString(mergingArray(a1, a2)));


    }
}
