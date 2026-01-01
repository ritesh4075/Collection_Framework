package collections.queue.linkedqueue;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class Queue_Iteration {
    public static void main(String[] args) {

        // Create queue and add elements
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        // Iterate using Iterator
        Iterator<Integer> it = q.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        // Iterate using forEach
        q.forEach(x -> System.out.print(x + " "));
    }
}
