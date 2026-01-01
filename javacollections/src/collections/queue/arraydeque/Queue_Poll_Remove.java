package collections.queue.arraydeque;

import java.util.Queue;
import java.util.ArrayDeque;

public class Queue_Poll_Remove {
    public static void main(String[] args) {

        // Create queue and add elements
        Queue<Integer> q = new ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);

        // Remove front element safely
        System.out.println(q.poll());

        // Remove front element strictly
        System.out.println(q.remove());

        // Print remaining queue
        System.out.println(q);
    }
}
