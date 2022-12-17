//find single missing element in an array of given range [0, n]

// [0, 1, 2, 3, 5, 6, 7, 8]

//ans : strategy 1: > we can apply summation sum(n) highest number in array - summation(given array)  > difference will be the missing number.

// strategy 2: > using 2 iterators with common difference and add to irregular difference.

public class SingleMissingElement {


    //largest number in array
    static int largestNumber(int[] ar) {
        int largestNo = -1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > largestNo) {
                largestNo = ar[i];
            }
        }
        return largestNo;
    }


    static int missingNumber(int[] arr) {

        int larNoArray = largestNumber(arr); //largest number in given array.

        int sumHighest, sum2;

        sumHighest = (larNoArray * (larNoArray + 1)) / 2; //sum of the highest number series


        //summation of given array
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }


        return sumHighest - s;
    }


    public static void main(String[] args) {

        int[] ar1 = {0, 1, 2, 3, 5, 6, 7, 8};
        System.out.println("missing element in array is " + missingNumber(ar1));
    }

}
