//get element for provided index on array. functions input array and index. returns -1 for element that doesn't exist and print for index out of bound.

public class GetElement {

    static int getElement(int[] a, int index) {
        if (index < 0 && index >= a.length) {
            System.out.println("index out of bound");
            return -1;
        }
        return a[index];
    }

    public static void main(String[] args) {


        int []a1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(getElement(a1, 4));
    }
}
