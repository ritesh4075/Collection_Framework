package collections.set.treeset;

import java.util.TreeSet;

public class TreeSet_Add {
    public static void main(String[] args) {

        // Creating TreeSet (sorted set)
        TreeSet<Integer> set = new TreeSet<>();

        // Adding elements (automatically sorted)
        set.add(30);
        set.add(10);
        set.add(20);

        // Duplicate element (ignored)
        set.add(20);

        System.out.println(set);
    }
}

