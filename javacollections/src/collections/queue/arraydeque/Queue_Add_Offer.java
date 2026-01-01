package collections.queue.arraydeque;

import java.util.Queue;
import java.util.ArrayDeque;

public class Queue_Add_Offer {
    public static void main(String[] args) {

        // Create queue
        Queue<Integer> q = new ArrayDeque<>();

        // Add elements (throws exception on failure)
        q.add(10);
        q.add(20);

        // Add element safely (returns false on failure)
        q.offer(30);

        // Print queue
        System.out.println(q);
    }
}
