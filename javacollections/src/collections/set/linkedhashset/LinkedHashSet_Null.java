package collections.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSet_Null {
    public static void main(String[] args) {

        // Creating LinkedHashSet
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Only one null allowed
        set.add(null);
        set.add(null);

        set.add(10);

        System.out.println(set);
    }
}

