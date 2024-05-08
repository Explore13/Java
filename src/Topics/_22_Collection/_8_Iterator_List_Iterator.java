package Topics._22_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class _8_Iterator_List_Iterator {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(100);
        System.out.println(list);
        /*
        // for loop
        System.out.println("For Loop : ");
        for (int i = 0; i < list.size(); i++) {
           // Object obj = list.get(i);
           // System.out.println(obj);
            System.out.println(list.get(i));
        }


        // for each
        System.out.println("ForEach Loop : ");
        for(Object obj : list)
        {
            System.out.println(obj);
        }

        // Using for loop or forEach loop, fetching the data from collection is not recommended approach.
       //  To avoid ConcurrentModificationException we have to use "Java Cursor" Concept i.e. Iterator concept.
 */

        // We should use Java Cursor or Iterator Concept in Java instead of Loop Concept to fetch the data.
        System.out.print("Using Iterator : ");
        Iterator iterator = list.iterator(); // Iterator ---> Interface
        while (iterator.hasNext()) {
            /*
            Integer val = (Integer) iterator.next();
            System.out.print(val+", ");
            */
            System.out.print(iterator.next() + " ");
        }

        // List Iterator
        /*
        - ListIterator is only for "List" based classes. e.g : ArrayList and LinkedList
        - ListIterator litr = list.listIterator(index);
        - If no index is given then it will set to 0th index.
        - To traverse in reverse we have to set the index value to "list.size()",
        then just use ".hasPrevious()" to check if there is any object or not and use
        ".previous()" to access the object.
        */
        System.out.print("\nUsing ListIterator : ");
        ListIterator litr = list.listIterator(list.size()); // ListIterator ---> Interface (SubInterface of Iterator)
        while (litr.hasPrevious()) {
            // Only in ListIterator there is the previous() and hasPrevious() method.
            System.out.print(litr.previous() + " ");
        }
    }
}

/*
# ConcurrentModification :
The ConcurrentModificationException occurs when an object is tried to be modified concurrently when it is not permissible.
This exception usually comes when one is working with Java Collection classes.

- To avoid ConcurrentModificationException we have to use "Java Cursor" Concept i.e. Iterator concept.
*/