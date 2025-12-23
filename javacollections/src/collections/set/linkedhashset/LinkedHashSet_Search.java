package collections.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSet_Search {
    public static void main(String[] args) {

        // Creating LinkedHashSet
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        // Checking if element exists
        System.out.println(set.contains(20));
        System.out.println(set.contains(100));
    }
}

