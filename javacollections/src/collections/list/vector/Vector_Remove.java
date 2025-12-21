package collections.list.vector;

import java.util.Vector;

public class Vector_Remove {
    public static void main(String[] args) {

        // Creating Vector
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(20);

        // Removing element by index
        v.remove(0);

        // Legacy removal by value
        v.removeElement(20);

        System.out.println(v);

        // Removing all elements
        v.clear();

        System.out.println(v);
    }
}

