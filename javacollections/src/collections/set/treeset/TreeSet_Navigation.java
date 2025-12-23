package collections.set.treeset;

import java.util.TreeSet;

public class TreeSet_Navigation {
    public static void main(String[] args) {

        // Creating TreeSet
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        // Closest element >= given value
        System.out.println(set.ceiling(25));

        // Closest element <= given value
        System.out.println(set.floor(25));

        // Strictly greater
        System.out.println(set.higher(20));

        // Strictly smaller
        System.out.println(set.lower(20));
    }
}

