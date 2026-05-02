package Topics._24_HashMap;

import java.util.*;

public class _2_TypesOfHashMap {
    public static void main(String[] args) {
        // Unordered data : HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Surya");
        map.put(1, "Anu");
        map.put(7, "Sana");
        map.put(5, "Krishna");

        System.out.println("HashMap looks like : " + map);

        // Ordered data : LinkedHashMap
        LinkedHashMap<Integer, String> map_1 = new LinkedHashMap<>();
        map_1.put(3, "Surya");
        map_1.put(1, "Anu");
        map_1.put(7, "Sana");
        map_1.put(5, "Krishna");
        System.out.println("HashMap looks like : " + map_1);

        // Sorted based on keys
        TreeMap<Integer, String> map_2 = new TreeMap<>();
        map_2.put(3, "Surya");
        map_2.put(1, "Anu");
        map_2.put(7, "Sana");
        map_2.put(5, "Krishna");

        System.out.println("HashMap looks like : " + map_2);
    }
}

/*
Map is an interface. HashTable, LinkedHashMap, HashMap implements the Map interface and TreeMap implements
SortedMap that extends Map interface.

1. HashTable
2. LinkedHashMap : Order of insertion is preserved.
3. HashMap : Unordered data, no order of insertion.
4. TreeMap : Returns sorted data in terms of the key.
*/