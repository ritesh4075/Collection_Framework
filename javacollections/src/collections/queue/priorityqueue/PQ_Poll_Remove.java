package collections.queue.priorityqueue;

import java.util.Queue;
import java.util.PriorityQueue;

public class PQ_Poll_Remove {
    public static void main(String[] args) {

        // Create priority queue
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);

        // Remove highest priority element
        System.out.println(pq.poll());
        System.out.println(pq.remove());

        System.out.println(pq);
    }
}
