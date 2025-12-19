package linkedlist;
import java.util.LinkedList;

public class LinkedList_Size {
    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Checking empty state
        System.out.println(list.isEmpty());

        list.add(10);
        list.add(20);

        // Getting number of elements
        System.out.println(list.size());
    }
}

