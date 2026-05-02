package Topics._24_HashMap;

import java.util.HashMap;
import java.util.Map;

public class _1_hashMapFunctions {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        // functionality of put() : store the key-value in a hashmap
        hashMap.put(1, "Surya");
        hashMap.put(3, "Anupam");
        hashMap.put(5, "Shankar");
        hashMap.put(7, "Sana");

        System.out.println("HashMap is : " + hashMap);

        // functionality of get() : get the corresponding value of a specific key
        String str = hashMap.get(3);
        System.out.println("Value of key = 3 is : " + str);

        // functionality of containsKey() : returns true/false if a key is there or not
        boolean isAvailable = hashMap.containsKey(2);
        System.out.println("Key = 2 is available : " + isAvailable);

        // functionality of remove() : remove a key-value
        hashMap.remove(1);
        System.out.println("Update hashmap is : " + hashMap);

        // functionality of entrySet
        System.out.println("Hashmap is : ");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }

    }
}
