package collections.set.treeset;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSet_Iteration {
    public static void main(String[] args) {

        // Creating TreeSet
        TreeSet<Integer> set = new TreeSet<>();
        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);

        // Iteration in sorted order
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        // Reverse order iteration
        Iterator<Integer> rit = set.descendingIterator();
        while (rit.hasNext()) {
            System.out.print(rit.next() + " ");
        }
    }
}

