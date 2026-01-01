package collections.queue.linkedqueue;

import java.util.Queue;
import java.util.LinkedList;

public class Queue_State {
    public static void main(String[] args) {

        // Create empty queue
        Queue<Integer> q = new LinkedList<>();

        // Check if queue is empty
        System.out.println(q.isEmpty());

        // Add elements
        q.add(10);
        q.add(20);

        // Print size and check existence
        System.out.println(q.size());
        System.out.println(q.contains(10));
    }
}
