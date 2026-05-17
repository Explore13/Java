package Topics._26_Queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// used add and remove method so that it throws an exception instead of false and null
class NewStack {
    private final Queue<Integer> queue = new LinkedList<>();
    private final Queue<Integer> stack = new LinkedList<>();

    public void pop() {
        try {
            if (!this.queue.isEmpty()) {
                Collections.reverse((List<?>) this.queue);
                while (!this.queue.isEmpty()) this.stack.add(this.queue.remove());
            }
            this.stack.remove();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void push(int val) {
        try {
            if (!this.stack.isEmpty()) {
                Collections.reverse((List<?>) this.stack);
                while (!stack.isEmpty()) this.queue.add(this.stack.remove());
            }
            this.queue.add(val);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    public int peek() {
        try {
            if (!this.queue.isEmpty()) {
                Collections.reverse((List<?>) this.queue);
                while (!this.queue.isEmpty()) this.stack.offer(this.queue.poll());
            }
            if (this.stack.peek() == null) throw new NullPointerException("No peek element");
            return this.stack.peek();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return -1;
        }
    }

    public Queue<Integer> print() {
        if (this.queue.isEmpty()) return this.stack;
        Collections.reverse((List<?>) this.queue);
        while (!this.queue.isEmpty()) this.stack.offer(this.queue.poll());
        return this.stack;
    }
}

public class _3_Stack_Using_Queue {
    public static void main(String[] args) {
        NewStack stack = new NewStack();
        System.out.println("The Stack --> " + stack.print());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("The Stack --> " + stack.print());

        stack.pop();
        System.out.println("The Stack --> " + stack.print());
        System.out.println("The peek of the Stack : " + stack.peek());
        stack.pop();
        System.out.println("The Stack --> " + stack.print());
        System.out.println("The peek of the Stack : " + stack.peek());
        stack.pop();
        System.out.println("The Stack --> " + stack.print());
        System.out.println("The peek of the Stack : " + stack.peek());


        stack.push(300);
        stack.push(400);
        stack.push(500);
        System.out.println("The Stack --> " + stack.print());
        stack.pop();
        System.out.println("The Stack --> " + stack.print());
    }
}
