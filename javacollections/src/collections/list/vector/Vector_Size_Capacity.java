package collections.list.vector;

import java.util.Vector;

public class Vector_Size_Capacity {
    public static void main(String[] args) {

        // Creating Vector with default capacity
        Vector<Integer> v = new Vector<>();

        // Capacity grows automatically
        System.out.println(v.capacity());

        v.add(10);
        v.add(20);

        // Number of elements
        System.out.println(v.size());

        // Checking empty state
        System.out.println(v.isEmpty());
    }
}

