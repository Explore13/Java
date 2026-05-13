package Topics._26_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class _1_Queue_Implementations {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue --> offer()
        for (int i = 10; i <= 50; i += 10)
            queue.offer(i);

        System.out.println("The Queue : " + queue);

        // Dequeue --> poll()
        System.out.println("The peek before polling : " + queue.peek());

        System.out.println("Polled element : " + queue.poll());
        System.out.println("After polling, the queue : " + queue);

        // peek value ---> peek()
        System.out.println("The peek after polling : " + queue.peek());

        // size
        System.out.println("Current size of the queue : " + queue.size());
    }
}


/*
 * FIFO
 * Queue in Java --> Interface
 * LinkedList and PriorityQueue classes implements Queue Interface
 * add() --> enqueue (throws Exception if fails)
 * remove() ---> dequeue (throws Exception if queue is empty)
 * size() ---> current size
 * element() ---> returns the front element (throws exception if not found)
 * enqueue or dequeue --> O(1)

 * Better Functions :
 * offer() --> returns false if insertion fails
 * poll() --> returns null if queue is empty
 * peek() ---> top most value in the queue (returns null if not found)


 * Example :
 * Queue<Integer> q = new ArrayBlockingQueue<>(2);
 * q.offer(1); // true
 * q.offer(2); // true
 * q.offer(3); // false
 * But;
 * q.add(3); // IllegalStateException


 *Queue<Integer> q = new LinkedList<>();
 * System.out.println(q.poll()); // null
 * q.remove(); // NoSuchElementException

 * System.out.println(q.peek()); // null
 * q.element(); // NoSuchElementException
 */