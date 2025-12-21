package collections.list.vector;

import java.util.Vector;
import java.util.Arrays;

public class Vector_Add {
    public static void main(String[] args) {

        // Creating Vector (synchronized List)
        Vector<Integer> v = new Vector<>();

        // Adding elements
        v.add(10);
        v.add(20);

        // Legacy method (same as add)
        v.addElement(30);

        // Adding multiple elements
        v.addAll(Arrays.asList(40, 50));

        System.out.println(v);
    }
}
