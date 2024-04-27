package Topics._22_Collection;

import java.util.PriorityQueue;

public class _5_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);


        System.out.println("Priority queue is : " + pq); // 25, 50, 125, 100, 75, 150, 175]

        pq.add(25); // Duplicate value is allowed
        System.out.println("Priority queue is : " + pq);

        /*
        pq.add("PW"); // Mixed type of data is not allowed (RunTime Exception) java.lang.ClassCastException
        System.out.println("Priority queue is : " + pq);
         */

        pq.remove(); // Remove the front end value
        System.out.println("Priority queue is : " + pq);
        boolean res = pq.remove(100); //100 will be removed
        System.out.println("Priority queue is : " + pq + "\n100 is removed ? : "+res);
    }
}

/*
 ******************* Priority Queue *******************

 * priorityQueue class follows Minimum Heap Data structure.
 * We can't add to first or based on index.
 * Order of insertion is not preserved.
 * It creates a binary tree and the lowest value will be on top and
 children's value should be greater than their parents' value. If
 large value comes then it will be swapped with its parent value.
 * Duplicate value is allowed.
 * Mixed type of data is not allowed.
 * "null" value is not allowed.
 * priorityQueue class implements "Queue" interface.
 *
 */