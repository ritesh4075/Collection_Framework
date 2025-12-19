package collections.list.linkedlist;
import java.util.LinkedList;

public class LinkedList_Get_Set {
    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // Accessing element using index
        int val = list.get(1);
        System.out.println(val);

        // Updating element at index
        list.set(1, 99);

        System.out.println(list);
    }
}

