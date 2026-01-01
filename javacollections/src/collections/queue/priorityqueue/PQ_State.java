package collections.queue.priorityqueue;

import java.util.Queue;
import java.util.PriorityQueue;

public class PQ_State {
    public static void main(String[] args) {

        // Create empty priority queue
        Queue<Integer> pq = new PriorityQueue<>();

        System.out.println(pq.isEmpty());

        pq.add(10);
        pq.add(20);

        System.out.println(pq.size());
        System.out.println(pq.contains(10));
    }
}

