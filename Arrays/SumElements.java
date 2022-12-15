//Find sum of all elements.


public class SumElements {


    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

//        let's use for loop for finding sum of all elements.

        int sum = 0;
        for (int i =0; i<a1.length; i++){
            sum += a1[i];
        }

        System.out.println(sum);
    }
}
