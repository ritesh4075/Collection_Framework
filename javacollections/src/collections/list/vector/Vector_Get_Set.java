package collections.list.vector;

import java.util.Vector;

public class Vector_Get_Set {
    public static void main(String[] args) {

        // Creating Vector
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);

        // Accessing element using index
        System.out.println(v.get(1));

        // Updating element at index
        v.set(1, 99);

        System.out.println(v);
    }
}
