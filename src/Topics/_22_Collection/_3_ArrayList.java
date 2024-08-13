package Topics._22_Collection;

import java.util.*;

public class _3_ArrayList {
    public static void main(String[] args) {

        ArrayList al1 = new ArrayList();
        // We can add same types of data, data is stored as object
        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add(400);
        al1.add(500);
        // al1.clear();

        System.out.println("al1 : " + al1);
        System.out.println("***********************************");

        ArrayList al2 = new ArrayList();
        // We also can add different types of data, data is stored as object
        al2.add("Surya Ghosh");
        al2.add("Java");
        al2.add(20);
        al2.add(50000);
        al2.add(5.6);

        System.out.println("al2 : " + al2);
        System.out.println("***********************************");
        al2.add("Added Later");
        System.out.println("al2 after added : " + al2);
        System.out.println("***********************************");

        ArrayList al3 = new ArrayList();
        al3.add(1);
        al3.add(2);
        al3.add(3);
        System.out.println("al3 : " + al3);
        System.out.println("***********************************");

        al3.addAll(al2); // Add the data of al2 to al3

        System.out.println("al3 after addAll : " + al3);

        al3.add(2, "HK"); /* We can add data to a particular index,
        but the data of that index will be shifted towards right, will not be replaced...  But  it is a slow process,
        as all the data from that index to last will be shifted to right side it is not an efficient process.
        So, we avoid this process and we use LinkedList instead of ArrayList to insert at any position.
        */

        System.out.println("al3 after add @ index : " + al3);
        System.out.println("***********************************");

        al3.add(100);
        System.out.println("al3 after adding 100 : "+al3);
        System.out.println("***********************************");

        al3.add(100); // Duplicate value is possible
        System.out.println("al3 after adding duplicate 100 : "+al3);
        System.out.println("***********************************");

    }
}

/*
1. All classes of Collection Framework are in "util" package. So, we have to import the util package.
Ex : import java.util.*; // Import all the classes and interfaces

2. We have to create an Object of the class.
Ex : ArrayList al1 = new ArrayList();


******************** ArrayList ********************
Java ArrayList is a part of the Java collections framework, and it is a class of java.util package.
It provides us with dynamic arrays in Java. Though, it may be slower than standard arrays but can be
helpful in programs where lots of manipulation in the array is needed. This class is found in java.util package.
The main advantage of ArrayList in Java is, that if we declare an array then we need to mention the size, but in ArrayList,
it is not needed to mention the size of ArrayList. If you want to mention the size then you can do it.

1. Order of insertion is preserved.
2. All data will be added to RearEnd.
3. We can store both homogeneous and heterogeneous type of data.
4. We can insert a collection into another collection.
5. We can store the data based on the index (Not Efficient).
6. Duplicate object is allowed in ArrayList.
7. ArrayList class implements "List" interface.

*/