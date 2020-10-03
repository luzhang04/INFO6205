// Leetcode 402
package Week2;

import java.util.Stack;

public class RemoveKDigits {
    public String removeKDigits(String num, int k) {
        char[] str = num.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            while (! stack.isEmpty() && k > 0 && str[i] < stack.peek()) {
                stack.pop();
                k--;
            }
            if (stack.isEmpty() && str[i] == '0') {
                continue;
            }
            stack.push(str[i]);
        }
        while (k > 0 && ! stack.isEmpty()) {
            stack.pop();
            k--;
        }
        if (stack.isEmpty()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (! stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}
