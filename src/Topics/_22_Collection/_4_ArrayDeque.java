package Topics._22_Collection;

import java.util.ArrayDeque;

public class _4_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque arr = new ArrayDeque();

        // We can add same types of data, data is stored as object
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println("ArrayDeque: " + arr);
        System.out.println("***********************************");

        // We also can add different types of data, data is stored as object
        arr.add("Surya Ghosh");
        arr.add("Java");
        System.out.println("ArrayDeque: " + arr);
        System.out.println("***********************************");

        // arr.add(null); null element is not allowed here
        arr.addFirst(1); // Add the element to front end
        arr.addLast(100); // Add the element to rear end
        System.out.println("ArrayDeque: " + arr);
        System.out.println("***********************************");

        // We can also remove a data
        arr.remove();
        System.out.println("ArrayDeque: " + arr);
        System.out.println("***********************************");

        // offer method
        arr.offer(500); /* Added to rear end, but it is not sure if it will be
        added or not. It may be rejected */
        System.out.println("ArrayDeque: " + arr);
        System.out.println("***********************************");

    }
}

/*
 ****************** ArrayDeque ******************
The ArrayDeque in Java provides a way to apply resizable-array in addition to the implementation of the Deque interface.
It is also known as Array Double Ended Queue or Array Deck. This is a special kind of array that grows and allows users to
add or remove an element from both sides of the queue.

The ArrayDeque class in Java is an implementation of the Deque interface that uses a resizable array to store its elements.
This class provides a more efficient alternative to the traditional Stack class, which was previously used for double-ended operations.
The ArrayDeque class provides constant-time performance for inserting and removing elements from both ends of the queue, making it a good
choice for scenarios where you need to perform many add and remove operations.



    Operation	               Method	                Methods throwing Exception
Insertion from Head	        offerFirst(e)	                    addFirst(e)
Removal from Head	        pollFirst()	                        removeFirst()
Retrieval from Head	        peekFirst()	                        getFirst()
Insertion from Tail	        offerLast(e)	                    addLast(e)
Removal from Tail	        pollLast()	                        removeLast()
Retrieval from Tail	        peekLast()	                        getLast()

* We can add data to front or rear end but can't add to any particular index. (No index based accessing)
* Duplicate object is allowed.
* We can store both homogeneous and heterogeneous type of data.
* "null" element is not allowed here.
* ArrayDeque directly implements "Deque" interface which extends "Queue" interface.
* Internally follows "Double Ended Queue".
* It is very lightWeight.
* It is dynamic, so size limitation.
* Normally data is removed from front end of the array.

 */