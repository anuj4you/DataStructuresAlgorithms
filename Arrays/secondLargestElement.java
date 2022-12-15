//Second largest element in array

public class secondLargestElement {

    public static void main(String[] args) {


        int[] a1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13};
        int l1 = a1[0], l2 = a1[0]; ;

        for(int i=0; i<a1.length; i++){
            if (a1[i] > l1){
                l2 = l1; //setting 2nd element = 1st to assign it 2nd largest.
                l1 = a1[i]; // set 1st element as largest element.
            }
        }
        System.out.println(l2);
        System.out.println(l1);

    }
}
