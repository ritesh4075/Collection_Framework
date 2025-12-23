package collections.set.treeset;

import java.util.TreeSet;

public class TreeSet_Size {
    public static void main(String[] args) {

        // Creating empty TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // Checking empty state
        System.out.println(set.isEmpty());

        set.add(10);
        set.add(20);

        // Number of elements
        System.out.println(set.size());
    }
}
