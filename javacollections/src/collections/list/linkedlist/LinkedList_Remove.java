package collections.list.linkedlist;
import java.util.LinkedList;

public class LinkedList_Remove {
    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        // Removing element by index
        list.remove(0);

        // Removing first occurrence of value
        list.remove(Integer.valueOf(20));

        System.out.println(list);

        // Removing all elements
        list.clear();

        System.out.println(list);
    }
}

