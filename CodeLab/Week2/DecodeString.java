// Leetcode 394
package Week2;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        int start = 0;
        strStack.push(new StringBuilder());
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9' &&
                    (i == 0 || (s.charAt(i-1) < '0' || s.charAt(i-1) > '9'))) {
                start = i;
            } else if (s.charAt(i) == '[') {
                strStack.push(new StringBuilder());
                numStack.push(Integer.valueOf(s.substring(start, i)));
            } else if (s.charAt(i) == ']') {
                int repeat = numStack.pop();
                StringBuilder str = strStack.pop();
                for (int j = 0; j < repeat; j++) {
                    strStack.peek().append(str);
                }
            } else if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                strStack.peek().append(s.charAt(i));
            }
        }

        return strStack.peek().toString();
    }
}
