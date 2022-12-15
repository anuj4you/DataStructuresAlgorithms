//set element to a provided index on array(replace the element on existing index with provided element)

import java.lang.reflect.Array;
import java.util.Arrays;

public class SetElement {


    static int setElement(int[] arr, int index, int elem) {
        if (index < 0 && index >= arr.length) {
            System.out.println("index out of bound");
            return -1;
        }
        arr[index] = elem;
        return 1;
    }

    public static void main(String[] args) {

        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(setElement(a1, 4, 4));
        System.out.println(Arrays.toString(a1));

    }
}
