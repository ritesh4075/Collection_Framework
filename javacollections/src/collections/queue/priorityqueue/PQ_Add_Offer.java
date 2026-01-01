package collections.queue.priorityqueue;

import java.util.Queue;
import java.util.PriorityQueue;

public class PQ_Add_Offer {
    public static void main(String[] args) {

        // Create priority queue
        Queue<Integer> pq = new PriorityQueue<>();

        // Insert elements
        pq.add(30);
        pq.add(10);
        pq.offer(20);

        // Internally sorted as heap, not visible order
        System.out.println(pq);
    }
}

