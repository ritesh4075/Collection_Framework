package collections.queue.arraydeque;
import java.util.Queue;
import java.util.ArrayDeque;

public class Queue_State {
    public static void main(String[] args) {

        // Create empty queue
        Queue<Integer> q = new ArrayDeque<>();

        // Check empty state
        System.out.println(q.isEmpty());

        // Add elements
        q.add(10);
        q.add(20);

        // Print size and existence
        System.out.println(q.size());
        System.out.println(q.contains(10));
    }
}

