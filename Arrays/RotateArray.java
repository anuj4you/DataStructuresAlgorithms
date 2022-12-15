//rotating array elements to right and left.

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8};

//        rotating array to left.
//        int temp = a1[0];
//
//        for (int i = 0; i < a1.length - 1; i++) {
//            a1[i] = a1[i + 1];
//        }
//        a1[a1.length - 1] = temp;


        //rotating to right. will start from opposite side otherwise will encounter getting previous element.

       // int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int t = a1[a1.length-1];

        for (int i=a1.length-1; i > 0; i--){

            a1[i] = a1[i-1];

        }

        a1[0] = t;

        System.out.println(Arrays.toString(a1));
    }
}
