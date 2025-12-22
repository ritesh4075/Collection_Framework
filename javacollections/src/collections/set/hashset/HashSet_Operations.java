package collections.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Operations {
    public static void main(String[] args) {

        // Creating two sets
        Set<Integer> a = new HashSet<>();
        a.add(1);
        a.add(2);
        a.add(3);

        Set<Integer> b = new HashSet<>();
        b.add(3);
        b.add(4);
        b.add(5);

        // Union
        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println(union);

        // Intersection
        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println(intersection);

        // Difference
        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.println(difference);
    }
}

