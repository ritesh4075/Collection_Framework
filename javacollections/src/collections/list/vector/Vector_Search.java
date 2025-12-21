package collections.list.vector;

import java.util.Vector;

public class Vector_Search {
    public static void main(String[] args) {

        // Creating Vector
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(20);

        // Checking if element exists
        System.out.println(v.contains(20));

        // First index of element
        System.out.println(v.indexOf(20));

        // Last index of element
        System.out.println(v.lastIndexOf(20));
    }
}
