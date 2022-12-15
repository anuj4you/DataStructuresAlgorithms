//sort given array. all -ve elements to left and +ve to right.

import java.util.Arrays;

public class SortPositiveNegative {


    static int[] SortPositiveNegative(int[] arr) {

        int i = 0;
        int j = arr.length - 1;
        while (i < j) {

            while (arr[i] < 0) {
                i++;
            }
            while (arr[j] >= 0) {
                j--;
            }
            if (i < j) {
                int temp = 0;
                arr[i] = temp;
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        return arr;
    }

    public static void main(String[] args) {


        int[] a1 = {-3, 4, -5, 6, -7, 2, 6, 7};
        System.out.println(Arrays.toString(SortPositiveNegative(a1)));
    }
}
