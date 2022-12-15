//check if given array is sorted or not.

public class CheckSorted {


    static boolean CheckArray(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int [] a1 = {1,2,3,4,5};
        int [] a2 = {5,2,3,4,1};
        int [] a3 = {6,5,4,3,2};

        System.out.println(CheckArray(a1));
        System.out.println(CheckArray(a2));
        System.out.println(CheckArray(a3));




    }
}
