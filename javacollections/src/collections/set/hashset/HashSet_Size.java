package collections.set.hashset;

import java.util.HashSet;

public class HashSet_Size {
    public static void main(String[] args) {

        // Creating empty HashSet
        HashSet<Integer> set = new HashSet<>();

        // Checking empty state
        System.out.println(set.isEmpty());

        set.add(10);
        set.add(20);

        // Getting number of elements
        System.out.println(set.size());
    }
}

