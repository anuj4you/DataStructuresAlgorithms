//deleting element on Array.

import java.util.Arrays;

public class DeleteElement {

    public static void main(String[] args) {
        int index = 2;  //index = index position on Array to be deleted.
        int a1[] = new int[10];
        a1[0] = 1;
        a1[1] = 2;
        a1[2] = 3;
        a1[3] = 4;
        a1[4] = 5;
        a1[9] = 10;

        //[1,2,3,4,5,0,0,0,0,0] -> [1,2,4,5,0,0,0,0,0]


        for (int i = index; i < a1.length - 1; i++) {
            a1[i] = a1[i + 1];
        }
        
        //delete the last element as deleting an element also, make (a1.length-2) = 0 & (a1.length--)
        
        a1[9] = 0;

        System.out.println(Arrays.toString(a1));
    }
}
