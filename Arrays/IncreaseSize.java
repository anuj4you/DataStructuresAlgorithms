//Increase size of array.
// 1. make new array 2* (a1.length) 2.copy elements to new array. 3. refer a1 to new array.

import java.util.Arrays;

public class IncreaseSize {

    public static void main(String[] args) {
        int [] a1 = {1,2,3,4,5};
        int [] a2 = new int[2*(a1.length)]; // step.1

        for (int i=0; i<a1.length; i++){    //step.2
            a2[i] = a1[i];
        }

        a1 = a2;  //step.3
        a2 = null;

        System.out.println(Arrays.toString(a1));


    }
}
