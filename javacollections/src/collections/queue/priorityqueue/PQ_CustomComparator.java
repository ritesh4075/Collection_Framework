package collections.queue.priorityqueue;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

public class PQ_CustomComparator {
    public static void main(String[] args) {

        // Create max-heap priority queue
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(10);
        pq.add(30);
        pq.add(20);

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}

