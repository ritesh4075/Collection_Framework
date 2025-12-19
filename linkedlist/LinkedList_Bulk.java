package linkedlist;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_Bulk {
    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Removing elements based on condition
        list.removeIf(x -> x % 2 == 0);

        System.out.println(list);

        // Modifying each element
        list.replaceAll(x -> x * 10);

        System.out.println(list);

        // Creating a sublist from LinkedList
        List<Integer> sub = list.subList(0, list.size());

        System.out.println(sub);
    }
}
