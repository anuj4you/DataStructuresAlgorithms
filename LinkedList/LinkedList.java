/*linkedList class ADT, will explore functions and design this LinkedList class.
* linked list is composed of nodes having reference to next node.
* Some operations in LL and their time complexity.
* search in LL -  by value & also by index. O(n) (traverse through the list.)
* Insertion in LL - at end - O(1), at beginning O(1), at middle O(n)
* Deletion in LL  at beginning O(1), at middle O(n), at end O(n).
* */

/* LL will have Node class with (value, add for next Node) front node & end node and each corresponding node pointing to it's next node
will need following functioning from LL i.e =

addFirst, addLast, deleteFirst, deleteLast, contains, indexOf methods.

LinkedList name = new LinkedList();
LinkedList<Integer> name = new LinkedList<>();
Types of LL -> single LL(only store reference to next node) Doubly LL(store reference to next & previous node)
 */

import java.util.NoSuchElementException;

public class LinkedList {

    private  class Node{
        private int value;
        private Node next;


        public Node(int value){
            this.value = value;
        }

    }

    private Node first;
    private Node last;
    private int size;

    //method to add at last of Linked List.
    public void addLast(int item){
        Node node = new Node(item); //declaring a new Node.
        //now will work on position.
        //if first= last = null -> set node as first and last.

            if(first == null)
                first = last = node;

        // if >1 node, set last node reference to node and change last to this node.
            else{
                last.next = node;
                last = node;
            }

            size++;


    }

    //method to add in beginning of Linked list.
    public void addFirst(int item){
        Node node = new Node(item);

        if(first == null)
            first = last = node;

        else{
            node.next = first;
            first = node;
        }
        size++;
    }


    // method to find index of given item. start with 0 index iterate through till current node != null. if found item return index at given place.
    public int indexOf(int item){
     int index = 0; //index for LL
     Node current = first; // current node we are at

     while(current != null){
         if(current.value == item)
             return index;

         index++;
         current = current.next;
     }

        return -1;
    }


    //contains method to find item if in list? //2 ways we can use indexOf again if it returns -1 not in list return false. or iterate again.
    public boolean contains(int item){
    //using index of method.
        if(indexOf(item) != -1)
            return true;

        return false;


    }

    //remove 1st item in Linked list method. if one node remove node otherwise -> [10 ->20 , 20->30, 30->40] just like variable value change. second = first.next, then first = null, first = second.
    public void removeFirst(){
        //if list is empty.

        if (first == null)
            throw new NoSuchElementException("list is empty.");
        //if only 1 item in list.
        if(first == last)
            first = last = null;

        else {
            Node second = first.next;
            first.next = null; // break link from 1st to 2nd node
            first = second; // set second node = first node
        }
        size--;
    }


    //method to return previous node of given node.
    private Node previous(Node node) {
        Node current = first;
        while (current != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }

        return null;
    }

    //remove from last to remove last find previous to last (traverse through a before last save it and set it.) then set the node and reference.
    public void removeLast() {

        if (first == null)
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;
        else {
            Node LastPrevious = previous(last);
            last = LastPrevious; // set previous to last node.
            last.next = null; //break reference to next node

        }
        size--;
    }

    //size method to get size of total elements. just make a variable and increase or decrease everytime add/del node.
    public int size(){
        return size;
    }


    //method to convert linked list to Array.
    public int[] toArray(){
        int[] array = new int[size];
        Node current = first;
        int index = 0;
        while(current != null){
            array[index++] = current.value;
            current = current.next;
        }

        return array;
    }
}
