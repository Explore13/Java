package Topics._22_Collection;

import java.util.PriorityQueue;

public class _5_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq= new PriorityQueue();

        pq.add(3);
        pq.add(6);
        pq.add(4);
        pq.add(1);
        pq.add(5);
        pq.add(2);

        System.out.println("Priority queue is : "+pq); // [1, 3, 2, 6, 5, 4]
    }
}

/*
******************* Priority Queue *******************

* Priority Queue follows Minimum Data structure.
*
 */