//let's reverse an Array using just O(n) time complexity
// let's do 2 swap at same iteration with i++ -> j-- till i>j.


import java.util.Arrays;

public class ReverseArray {


    static int[] ReverseArray(int[] arr){



        for(int i=0,j=arr.length-1;i<j;i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {

        int [] a1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(ReverseArray(a1)));
    }

}
