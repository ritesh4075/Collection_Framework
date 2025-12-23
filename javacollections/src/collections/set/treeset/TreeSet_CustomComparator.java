package collections.set.treeset;

import java.util.TreeSet;
import java.util.Comparator;

public class TreeSet_CustomComparator {
    public static void main(String[] args) {

        // TreeSet with custom comparator (descending order)
        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());

        set.add(10);
        set.add(30);
        set.add(20);

        System.out.println(set);
    }
}

