package collections.list.linkedlist;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedList_Iteration {
    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // Iterating using Iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        // Iterating forward and backward using ListIterator
        ListIterator<Integer> lit = list.listIterator();
        while (lit.hasNext()) {
            System.out.print(lit.next() + " ");
        }

        System.out.println();

        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }

        System.out.println();

        // Iterating using forEach
        list.forEach(x -> System.out.print(x + " "));
    }
}

