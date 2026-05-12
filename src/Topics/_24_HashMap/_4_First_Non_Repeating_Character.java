package Topics._24_HashMap;

import java.util.HashMap;
import java.util.Locale;

public class _4_First_Non_Repeating_Character {
    private static int findChar(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i);
            boolean isPresent = false;
            for (int j = i + 1; j < str.length(); j++)
                if (str.charAt(j) == ch) {
                    isPresent = true;
                    break;
                }

            if (!isPresent) return i;
        }
        return -1;
    }

    private static int findCharMap(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        // store all the chars into the hashmap
        for (int i = 0; i < str.length(); i++) {
            if (hashMap.containsKey(str.charAt(i))) hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);
            else hashMap.put(str.charAt(i), 1);
        }

        // traverse through the hashmap
        for (int i = 0; i < str.length(); i++) {
            if (hashMap.get(str.charAt(i)) == 1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "PriyaPriya";
        System.out.println("Non repeating char's index is : " + _4_First_Non_Repeating_Character.findChar(str));
        System.out.println(("Non repeating char is " + ((findCharMap(str) != -1) ? str.charAt(findCharMap(str)) :
                "not found")));
    }
}
