package collections.set.hashset;

import java.util.HashSet;

public class HashSet_Remove {
    public static void main(String[] args) {

        // Creating HashSet
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);

        // Removing element
        set.remove(20);

        System.out.println(set);

        // Removing all elements
        set.clear();

        System.out.println(set);
    }
}
