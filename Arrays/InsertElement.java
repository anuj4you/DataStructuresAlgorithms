//Inserting element in array.

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertElement {


    public static void main(String[] args) {

        //[1,2,3,4,5,0,0,0,0,0] -> [1,2,12,3,4,5,0,0,0,0]
        int index = 2; int elem = 12; //index = index position on Array, elem = element to be inserted.
        int a1[] = new int[10];
        a1[0] = 1;
        a1[1] = 2;
        a1[2] = 3;
        a1[3] = 4;
        a1[4] = 5;



        for (int i=a1.length-1; i>index; i--){
            a1[i] = a1[i-1];

        }
        a1[index] = elem;

        System.out.println(Arrays.toString(a1));

    }
}
