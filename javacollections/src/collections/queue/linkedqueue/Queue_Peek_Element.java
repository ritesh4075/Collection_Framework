package collections.queue.linkedqueue;

import java.util.Queue;
import java.util.LinkedList;

public class Queue_Peek_Element {
    public static void main(String[] args) {

        // Create queue and add elements
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);

        // View front element safely (null if empty)
        System.out.println(q.peek());

        // View front element strictly (exception if empty)
        System.out.println(q.element());
    }
}
