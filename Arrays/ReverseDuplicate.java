//Reversing duplicate array.
// a1[1,2,3,4,5]->a2[5,4,3,2,1].

import java.util.Arrays;

public class ReverseDuplicate {

    public static void main(String[] args) {
        int [] a1 = {1,2,3,4,5};
        int[] a2 = new int[5];

        for (int i=0; i<a1.length;i++){
            a2[i] = a1[(a1.length-1)-i];
        }

        System.out.println("a1 is "+ Arrays.toString(a1));
        System.out.println("a2 is "+ Arrays.toString(a2));
    }

}
