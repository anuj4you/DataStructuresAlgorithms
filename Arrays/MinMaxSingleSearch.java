
//finding min and max on array in single scan.

import java.util.Arrays;

public class MinMaxSingleSearch {

    static void MinMax(int[] arr) {

        int min = 0, max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(min);
        System.out.println(max);


    }


    public static void main(String[] args) {

        int[] ar1 = {2, 8, 15, 9, 20, 1};
        MinMax(ar1);

    }

}

