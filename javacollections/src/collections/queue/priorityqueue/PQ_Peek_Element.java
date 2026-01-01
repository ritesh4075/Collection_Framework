package collections.queue.priorityqueue;

import java.util.Queue;
import java.util.PriorityQueue;

public class PQ_Peek_Element {
    public static void main(String[] args) {

        // Create priority queue
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);

        // View highest priority element
        System.out.println(pq.peek());
        System.out.println(pq.element());
    }
}
