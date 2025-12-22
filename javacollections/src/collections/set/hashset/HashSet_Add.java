package collections.set.hashset;

import java.util.HashSet;

public class HashSet_Add {
    public static void main(String[] args) {

        // Creating HashSet (no order, no duplicates)
        HashSet<Integer> set = new HashSet<>();

        // Adding elements
        set.add(10);
        set.add(20);
        set.add(30);

        // Duplicate element (will be ignored)
        set.add(20);

        System.out.println(set);
    }
}
