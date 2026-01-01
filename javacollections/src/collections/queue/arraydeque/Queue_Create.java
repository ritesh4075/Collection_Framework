package collections.queue.arraydeque;

import java.util.Queue;
import java.util.ArrayDeque;

public class Queue_Create {
    public static void main(String[] args) {

        // Create queue backed by ArrayDeque
        Queue<Integer> q = new ArrayDeque<>();

        // Print empty queue
        System.out.println(q);
    }
}
