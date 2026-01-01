package collections.queue.arraydeque;

import java.util.Queue;
import java.util.ArrayDeque;

public class Queue_Peek_Element {
    public static void main(String[] args) {

        // Create queue and add elements
        Queue<Integer> q = new ArrayDeque<>();
        q.add(10);
        q.add(20);

        // View front element safely
        System.out.println(q.peek());

        // View front element strictly
        System.out.println(q.element());
    }
}

