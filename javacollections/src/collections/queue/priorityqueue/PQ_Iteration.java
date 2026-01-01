package collections.queue.priorityqueue;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class PQ_Iteration {
    public static void main(String[] args) {

        // Create priority queue
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);

        // Iteration does NOT return sorted order
        Iterator<Integer> it = pq.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
