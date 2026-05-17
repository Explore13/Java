package Topics._26_Queue;

import java.util.Stack;

class NewQueue {
    private final Stack<Integer> stack = new Stack<>();
    private final Stack<Integer> queue = new Stack<>();

    public void enQueue(int val) {
        try {
            while (!this.queue.isEmpty()) {
                this.stack.push(queue.pop());
            }
            this.stack.push(val);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void deQueue() {
        try {
            while (!this.stack.isEmpty()) {
                this.queue.push(stack.pop());
            }
            this.queue.pop();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    public int peek() {
        while (!this.stack.isEmpty()) this.queue.push(this.stack.pop());
        return this.queue.peek();
    }

    public Stack<Integer> print() {
        if (!this.stack.isEmpty()) return this.stack;
        while (!this.queue.isEmpty()) this.stack.push(this.queue.pop());
        return this.stack;
    }
}

public class _2_Queue_Using_Stack {

    public static void main(String[] args) {
        NewQueue queue = new NewQueue();
        System.out.println("The Queue --> " + queue.print());
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        System.out.println("The Queue --> " + queue.print());

        queue.deQueue();
        System.out.println("The Queue --> " + queue.print());
        System.out.println("The peek of the queue : " + queue.peek());
        queue.deQueue();
        System.out.println("The Queue --> " + queue.print());
        System.out.println("The peek of the queue : " + queue.peek());
        queue.deQueue();
        System.out.println("The Queue --> " + queue.print());
        System.out.println("The peek of the queue : " + queue.peek());


        queue.enQueue(300);
        queue.enQueue(400);
        queue.enQueue(500);
        System.out.println("The Queue --> " + queue.print());
        queue.deQueue();
        System.out.println("The Queue --> " + queue.print());


    }
}
