package collections.list.stack;
import java.util.Stack;

public class Stack_Push {
    public static void main(String[] args) {

        // Creating Stack (LIFO structure)
        Stack<Integer> stack = new Stack<>();

        // Adding elements to top of stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);
    }
}
