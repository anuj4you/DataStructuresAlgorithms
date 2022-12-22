//class to find if any duplicates in SORTED array also find out the time it occurs.
//
public class DuplicateElement {

    public static int findDuplicate(int[] ar) {

        int i, j;

        for (i = 0; i < ar.length - 1; i++) {
            if (ar[i] == ar[i + 1]) {
                j = i + 1;
                while (ar[j] == ar[i]) j++;
                System.out.println(ar[i] + "appears " + (j - i) + "times");
                i = j - 1;
            }
        }
        return 0;
    }


    public static void main(String[] args) {

    }
}
