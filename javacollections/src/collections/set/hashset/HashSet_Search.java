package collections.set.hashset;

import java.util.HashSet;

public class HashSet_Search {
    public static void main(String[] args) {

        // Creating HashSet
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        // Checking existence of element
        System.out.println(set.contains(20));
        System.out.println(set.contains(100));
    }
}
