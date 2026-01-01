package collections.queue.priorityqueue;

import java.util.PriorityQueue;

public class PQ_Null {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // This throws NullPointerException
        pq.add(null);
    }
}

