package collections.list.vector;

import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;

public class Vector_Iteration {
    public static void main(String[] args) {

        // Creating Vector
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);

        // Iterating using Iterator
        Iterator<Integer> it = v.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        // Legacy Enumeration
        Enumeration<Integer> e = v.elements();
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }

        System.out.println();

        // Modern forEach
        v.forEach(x -> System.out.print(x + " "));
    }
}

