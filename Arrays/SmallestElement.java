//finding the smallest element in array.

public class SmallestElement {


    static int smallestElement(int[] arr) {
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {

        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1};
        System.out.println(smallestElement(a1));
    }
}
