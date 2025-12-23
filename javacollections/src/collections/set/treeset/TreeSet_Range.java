package collections.set.treeset;

import java.util.TreeSet;
import java.util.SortedSet;

public class TreeSet_Range {
    public static void main(String[] args) {

        // Creating TreeSet
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        // Elements from 20 (inclusive) to 40 (exclusive)
        SortedSet<Integer> sub = set.subSet(20, 40);
        System.out.println(sub);

        // Elements less than 30
        System.out.println(set.headSet(30));

        // Elements greater than or equal to 30
        System.out.println(set.tailSet(30));
    }
}


