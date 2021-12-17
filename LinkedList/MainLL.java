import java.util.Arrays;

/*Main class calling Linked list class.
*/
public class MainLL {

    public static void main(String[] args) {

        LinkedList items = new LinkedList();

        items.addLast(20);
        items.addLast(30);
        items.addFirst(10);
        items.addFirst(40);

        System.out.println(items.indexOf(40));
        System.out.println(items.contains(0));
        System.out.println(items.contains(10));

        items.removeFirst();
        items.removeLast();

        System.out.println(items.size());

        System.out.println(Arrays.toString(items.toArray()));




    }
}
