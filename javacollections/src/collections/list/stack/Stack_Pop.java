package collections.list.stack;

import java.util.Stack;

public class Stack_Pop {
    public static void main(String[] args) {

        // Creating Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Removing top element (LIFO)
        int removed = stack.pop();

        System.out.println("Removed "+removed);
        System.out.println(stack);
    }
}

