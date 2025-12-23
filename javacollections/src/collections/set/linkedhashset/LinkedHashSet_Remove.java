package collections.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSet_Remove {
    public static void main(String[] args) {

        // Creating LinkedHashSet
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        // Removing a specific element
        set.remove(20);

        System.out.println(set);

        // Removing all elements
        set.clear();

        System.out.println(set);
    }
}

