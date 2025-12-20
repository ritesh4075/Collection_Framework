package collections.list.stack;

import java.util.Stack;

public class Stack_Search {
    public static void main(String[] args) {

        // Creating Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Checking if stack is empty
        System.out.println(stack.empty());

        // Searching element (1-based position from top)
        System.out.println(stack.search(20));
        System.out.println(stack.search(100));
    }
}

