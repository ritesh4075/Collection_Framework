package collections.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSet_Size {
    public static void main(String[] args) {

        // Creating empty LinkedHashSet
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Checking empty state
        System.out.println(set.isEmpty());

        set.add(10);
        set.add(20);

        // Getting number of elements
        System.out.println(set.size());
    }
}

