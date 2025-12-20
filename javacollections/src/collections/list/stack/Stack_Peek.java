package collections.list.stack;

import java.util.Stack;

public class Stack_Peek {
    public static void main(String[] args) {

        // Creating Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);

        // Viewing top element without removing it
        int top = stack.peek();

        System.out.println(top);
        System.out.println(stack);
    }
}

