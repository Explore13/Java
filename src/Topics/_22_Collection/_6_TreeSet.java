package Topics._22_Collection;

import java.util.*;

public class _6_TreeSet {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);

        System.out.println(ts); // [25, 50, 75, 100, 125, 150, 175]

        ts.add(100); // Duplicate value can not be added but it will produce any error
        System.out.println(ts); // [25, 50, 75, 100, 125, 150, 175]

        System.out.println("Higher : " + ts.higher(50) + " Lower : " + ts.lower(50));
        // Higher : 75 Lower : 25
        System.out.println("Higher : " + ts.higher(40) + " Lower : " + ts.lower(40));
        // Higher : 50 Lower : 25

        System.out.println("Ceiling Value : " + ts.ceiling(40) + " Floor Value : " + ts.floor(40));
        // Ceiling Value : 50 Floor Value : 25
        System.out.println("Ceiling Value : " + ts.ceiling(50) + " Floor Value : " + ts.floor(50));
        // Ceiling Value : 50 Floor Value : 50

        // ts.add("Hi"); // Mixed type not allowed

        
    }
}

/*
1. TreeSet implements "SortedSet" interface that extends "Set" interface.
2. Order of insertion is not preserved.
3. Duplicate value will not be added.
4. TreeSet follows "Binary Search Trees" internally.
5. TreeSet follows "InOrder" traversal.

**** Important Methods ****
1. ceiling(E e): This method returns the least element in the set that is greater than or equal to the given element e.
If e itself is present in the set, it will be returned. If there is no such element (i.e., all elements in the set are less than e), null is returned.

2. floor(E e): This method returns the greatest element in the set that is less than or equal to the given element e.
If e itself is present in the set, it will be returned. If there is no such element (i.e., all elements in the set are greater than e), null is returned.

3. higher(E e): This method returns the least element in the set that is strictly greater than the given element e.
If no such element exists (i.e., all elements in the set are less than or equal to e), null is returned.

4. lower(E e): This method returns the greatest element in the set that is strictly less than the given element e.
If no such element exists (i.e., all elements in the set are greater than or equal to e), null is returned.


#### Check the "NoteBook" for more details. ####
*/