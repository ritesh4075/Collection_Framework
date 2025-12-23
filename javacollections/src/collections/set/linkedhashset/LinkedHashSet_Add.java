package collections.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSet_Add {
    public static void main(String[] args) {

        // Creating LinkedHashSet (maintains insertion order)
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Adding elements
        set.add(10);
        set.add(20);
        set.add(30);

        // Duplicate element (ignored)
        set.add(20);

        System.out.println(set);
    }
}

