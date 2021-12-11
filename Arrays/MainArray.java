/* Main class calling Array class and its features.
initialize array, print elements - no garbage values, search elements return the index, change size(dynamic), remove element at given index
 */

public class MainArray {
    public static void main(String[] args) {

        //make object of Array class and try its methods.
    Array list = new Array(4);


    list.insert(10);
    list.insert(12);
    list.insert(20);
    list.delete(1);

    list.print();

    System.out.println(list.indexOf(20));
    System.out.println(list.length());
    System.out.println(list.size());

    }
}
