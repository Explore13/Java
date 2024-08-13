package Topics._22_Collection;

import java.util.*;


public class _7_HashSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(100);
        hs.add(20);
        hs.add(30);
        hs.add(40);

        System.out.println(hs.hashCode()); // 190
        System.out.println(hs); // [100, 20, 40, 30]

        hs.add("Hi"); // Mixed data allowed

        System.out.println(hs.hashCode()); // 2527
        System.out.println(hs); // [Hi, 100, 20, 40, 30]


        // To preserve the order of insertion we have to use LinkedHashSet
        LinkedHashSet ls = new LinkedHashSet();
        ls.add(100);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        System.out.println(ls.hashCode());
        System.out.println(ls);

        ls.add("Hi"); // Mixed type data allowed
        System.out.println(ls.hashCode()); // 2527
        System.out.println(ls); // [100, 20, 30, 40, Hi]
    }
}
/*
# HashSet :
1. It implements "Set" interface.
2. "LinkedHashSet" is a sub class of "HashSet" Class.
3. It was introduced in Java 1.2
4. No index based insertion.
5. Order of insertion is not preserved.
6. HashSet follows Hashing algorithm, HashTable data structure.
7. Load Factor of HashTable is 0.75 or 75%
8. Normally there are 16 buckets in HashTable. If we fill 75% of the
 buckets then it will grow to 2X, it means it will be doubled dynamically.
9. Searching Time Complexity in HashTable : O(1)

# LinkedHashSet :
- To preserve the order of insertion we have to use "LinkedHashSet".
- It internally follows "HashSet" and "LinkedList" also.
- Load Factor = 0.75
- It was introduced in Java 1.4
- Sub Class of HashSet
- Order of insertion is preserved.
*/
