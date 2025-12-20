package collections.list.stack;

import java.util.Stack;

public class Stack_List_Operations {
    public static void main(String[] args) {

        // Stack extends Vector and implements List
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Accessing element using index (List behavior)
        System.out.println(stack.get(1));

        // Updating element using index
        stack.set(1, 99);

        // Removing element using index
        stack.remove(0);

        System.out.println(stack);
    }
}

