/*
Create a class Array to implement its functions and solve it pieces by pieces. We will
1. create a class Array and perform save and printing of it's content.
 */
public class Array {
    //use of real array to initialize array
    private int[] items;
    int count = 0; // int to keep track of declared elements.

    // constructor for Array class.
    public Array(int length) {
        items = new int[length];
    }

    // print all elements for this array items.
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    //method to insert items in this Array
    public void insert(int item) {
        // if Array is full make a new array double the size. copy sll already existing elements.
        // initialize items to this new array.

        if (items.length == count) {
            int[] newItems = new int[count * 2]; // created new array 2 times size

            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }

            items = newItems; // set actual array to new array object.

        }
        items[count++] = item;
    }

    //delete an item from items array at given index.
    public void delete(int index) {
        //check if index is valid.
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("out of index please check again");
        }

        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;

    }

    //search for given item and return index of it.
    public int indexOf(int item) {

        for (int i=0; i < count; i++){
            if (items[i] == item)
                return i;

        }
        return -1;
    }

    //get length of array initialized elements.
    public int length(){

        return count;
    }
    public int size(){
        return items.length;
    }
}
