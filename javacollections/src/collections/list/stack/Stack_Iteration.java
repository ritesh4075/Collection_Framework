package collections.list.stack;

import java.util.Stack;
import java.util.Iterator;

public class Stack_Iteration {
    public static void main(String[] args) {

        // Creating Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Iterating using Iterator
        Iterator<Integer> it = stack.iterator();
        System.out.print("Iterating using Iterator: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        // Iterating using forEach
        System.out.print("Iterating through forEach loop: ");
        stack.forEach(x -> System.out.print(x + " "));
    }
}

