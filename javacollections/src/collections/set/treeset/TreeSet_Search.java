package collections.set.treeset;

import java.util.TreeSet;

public class TreeSet_Search {
    public static void main(String[] args) {

        // Creating TreeSet
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        // Checking existence of element
        System.out.println(set.contains(20));
        System.out.println(set.contains(100));
    }
}

