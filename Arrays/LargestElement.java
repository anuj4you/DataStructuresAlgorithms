//Finding largest element in the array

public class LargestElement {

    public static void main(String[] args) {

        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12};
        int largest = a1[0];

        for (int i=0; i< a1.length; i++){
            if (largest < a1[i]){
                largest = a1[i];
            }
        }
        System.out.println(largest);
    }

}
