//class to find if any duplicates in SORTED array also find out the time it occurs.
//[1, 2, 3, 4, 4, 5, 6, 7, 7, 7, 8]  -> 4*2    7*3
public class DuplicateElement {

    public static void findDuplicate(int[] ar) {

        int i, j;

        for (i = 0; i < ar.length - 1; i++) {
            if (ar[i] == ar[i + 1]) {
                j = i + 1;
                while (ar[j] == ar[i]) j++;
                System.out.println(ar[i] + " appears -> " + (j - i) + " times");
                i = j - 1; //bring i back to position next to repeated element.
            }
        }

    }


    public static void main(String[] args) {


        int [] a1 = {1, 2, 3, 4, 4, 5, 6, 7, 7, 7, 8};
        findDuplicate(a1);

    }
}
