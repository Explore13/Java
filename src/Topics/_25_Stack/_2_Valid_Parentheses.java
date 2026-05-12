package Topics._25_Stack;

import java.util.*;

public class _2_Valid_Parentheses {

    private static boolean isValid(String str) {
        if (str == null || str.isEmpty()) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                continue;
            } else if (stack.isEmpty()) return false;

            char peekChar = stack.peek();
            if (ch == ')' && (peekChar == '{' || peekChar == '[')) return false;
            if (ch == '}' && (peekChar == '(' || peekChar == '[')) return false;
            if (ch == ']' && (peekChar == '(' || peekChar == '{')) return false;
            stack.pop();
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{[]()}";
        System.out.println(isValid(str));
    }
}

/*
Time Complexity : O(n)
Space Complexity : O(n)
*/
