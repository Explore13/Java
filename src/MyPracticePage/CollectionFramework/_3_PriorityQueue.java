package MyPracticePage.CollectionFramework;

import java.util.PriorityQueue;

public class _3_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();

        pq.add(100);
        pq.add(20);
        pq.add(10);
        pq.add(400);
        pq.add(50);
        pq.add(170);

        System.out.println(pq);

        // pq.add("Hi"); // Exception

        pq.add(20); // Duplicate Allowed
        System.out.println(pq);

        PriorityQueue <String> pq2 = new PriorityQueue<String>();

        pq2.add("ABCDE");
        pq2.add("BAC");
        pq2.add("CA");
        pq2.add("D");
        // pq2.add("High");

        System.out.println(pq2);
    }
}
