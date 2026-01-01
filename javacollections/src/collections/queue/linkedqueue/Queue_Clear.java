package collections.queue.linkedqueue;
import java.util.Queue;
import java.util.LinkedList;

public class Queue_Clear {
    public static void main(String[] args) {

        // Create queue and add elements
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);

        // Remove all elements
        q.clear();

        // Print empty queue
        System.out.println(q);
    }
}
