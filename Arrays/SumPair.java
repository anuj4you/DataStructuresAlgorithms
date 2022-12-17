// check weather given array has pair that sums upto given value

//[1, 4, 5, 8, 6, 12]  valueSum=10  -> true
public class SumPair {

    static boolean sumpair(int[] ar, int valueSum) {

        for (int i = 0; i < ar.length - 1; i++) {

            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] + ar[j] == valueSum) {
                    System.out.println(ar[i] + "+" + ar[j] + "=" + valueSum);
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {


        int[] ar1 = {1, 4, 5, 8, 6, 12};
        System.out.println(sumpair(ar1, 10));
    }

}
