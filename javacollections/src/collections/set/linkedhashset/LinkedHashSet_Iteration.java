package collections.set.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSet_Iteration {
    public static void main(String[] args) {

        // Creating LinkedHashSet
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(30);
        set.add(10);
        set.add(20);

        // Iteration preserves insertion order
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        // forEach iteration
        set.forEach(x -> System.out.print(x + " "));
    }
}

