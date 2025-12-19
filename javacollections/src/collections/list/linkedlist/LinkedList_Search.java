package collections.list.linkedlist;
import java.util.LinkedList;

public class LinkedList_Search {
    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        // Checking if element exists
        System.out.println(list.contains(20));

        // First index of element
        System.out.println(list.indexOf(20));

        // Last index of element
        System.out.println(list.lastIndexOf(20));
    }
}
