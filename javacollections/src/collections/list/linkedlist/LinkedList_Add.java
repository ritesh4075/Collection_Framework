package collections.list.linkedlist;
import java.util.LinkedList;
import java.util.Arrays;

public class LinkedList_Add {
    public static void main(String[] args) {

        // Creating LinkedList using List behavior
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements at the end
        list.add(10);
        list.add(20);
        list.add(30);

        // Adding element at a specific index
        list.add(1, 15);

        // Adding multiple elements at once
        list.addAll(Arrays.asList(40, 50));

        System.out.println(list);
    }
}
