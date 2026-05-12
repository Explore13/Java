package Topics._25_Stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class _1_Stack_Implementation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();

        // push : to add an element into a stack
        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.push(10);
        System.out.println("The Stack : " + stack);

        // pop : remove the top most element from the stack
        int item = stack.pop();
        System.out.println("Item removed : " + item);
        System.out.println("The Stack after removing the top most element : " + stack);

        // peek : returns the top most element of the stack
        System.out.println("The peek element is before pop : " + stack.peek());
        stack.pop();
        System.out.println("The peek element is after pop : " + stack.peek());

        // search : search an element in a stack (1 based indexing from top)
        System.out.println("The Stack : " + stack);
        System.out.println("The position of 50 is : " + stack.search(50));
        System.out.println("The position of 60 is : " + stack.search(60));

        // empty : check if stack is empty or not (boolean)
        System.out.println("Is Stack Empty : " + stack.empty());

        // stack underflow condition
        try {
            int i = stack.pop();
            System.out.println(i + " is popped out");
            i = stack.pop();
            System.out.println(i + " is popped out");
            i = stack.pop();
            System.out.println(i + " is popped out");
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("The Exception : " + e);
        }

    }
}
