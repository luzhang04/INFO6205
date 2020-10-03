// Leetcode 921
package Week2;

import java.util.Stack;

public class MinAddToMakeValid {
    public int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack<>();
        int ctr = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '(') {
                stack.push(c);
            }
            else if (c == ')') {
                if (! stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
                else {
                    ctr++;
                }
            }
        }
        return ctr + stack.size();
    }
}
