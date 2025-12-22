package collections.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Iteration {
    public static void main(String[] args) {

        // Creating HashSet
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        // Iterating using Iterator
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        // Iterating using forEach
        set.forEach(x -> System.out.print(x + " "));
    }
}

