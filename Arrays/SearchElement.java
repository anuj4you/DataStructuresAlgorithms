//Searching an element in given array. make sure there are no duplicates when searching for element in any DS.


import java.lang.reflect.Array;

public class SearchElement {


    public static void main(String[] args) {


        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int a = 22;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == a) {
                System.out.println("yes item in array! on index >>");
                System.out.println(i);
                break;
            }

        }
        System.out.println("not in array!");


    }
}
