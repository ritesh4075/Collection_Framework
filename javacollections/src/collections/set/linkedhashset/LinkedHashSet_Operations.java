package collections.set.linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_Operations {
    public static void main(String[] args) {

        // Creating two LinkedHashSets
        Set<Integer> a = new LinkedHashSet<>();
        a.add(1);
        a.add(2);
        a.add(3);

        Set<Integer> b = new LinkedHashSet<>();
        b.add(3);
        b.add(4);
        b.add(5);

        // Union (order follows first set, then new elements)
        Set<Integer> union = new LinkedHashSet<>(a);
        union.addAll(b);
        System.out.println(union);

        // Intersection
        Set<Integer> intersection = new LinkedHashSet<>(a);
        intersection.retainAll(b);
        System.out.println(intersection);

        // Difference
        Set<Integer> difference = new LinkedHashSet<>(a);
        difference.removeAll(b);
        System.out.println(difference);
    }
}

