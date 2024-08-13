package Topics._22_Collection;

import java.util.*;

public class _9_IntroductionToMap {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        Hashtable ht = new Hashtable();
        LinkedHashMap lhm = new LinkedHashMap();
        TreeMap tm = new TreeMap();
    }
}
/*
In Java, a Map is an interface that represents a collection of key-value pairs.
Each key is associated with exactly one value. Maps are commonly used to store and
retrieve data based on keys, offering efficient lookup operations. We can easily search,
update or delete elements on the basis of key.

- Value need not be unique.
- Key must be unique.
- Key could be of any type (not only number).
- Key-Value pair is called "Entry" technically.
Ex : Aadhar Card (Aadhar number is a key (unique id) and the personal details is the value).

# All classes and interfaces are in "util" package.
*/