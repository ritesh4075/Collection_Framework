package collections.set.treeset;

import java.util.TreeSet;

public class TreeSet_Remove {
    public static void main(String[] args) {

        // Creating TreeSet
        TreeSet<Integer> set = new TreeSet<>();
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

