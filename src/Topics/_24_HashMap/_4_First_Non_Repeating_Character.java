package Topics._24_HashMap;

import java.util.Locale;

public class _4_First_Non_Repeating_Character {
    private static int findChar(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i);
            boolean isPresent = false;
            for (int j = i + 1; j < str.length(); j++)
                if (Character.toLowerCase(str.charAt(j)) == Character.toLowerCase(ch)) {
                    isPresent = true;
                    break;
                }

            if (!isPresent) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = "Priya";
        System.out.println("Non repeating char's index is : " + _4_First_Non_Repeating_Character.findChar(str));
    }
}
