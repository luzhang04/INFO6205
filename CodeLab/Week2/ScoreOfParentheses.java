// Leetcode 856
package Week2;

import java.util.Stack;

public class ScoreOfParentheses {
    public int scoreOfParentheses(String S) {
        if (S == null || S.length() == 0) {
            return 0;
        }

        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.push(-1);
            } else {
                int curr = 0;
                while (stack.peek() != -1) {
                    curr += stack.pop();
                }

                stack.pop();

                if (curr == 0) {
                    curr = 1;
                } else {
                    curr *= 2;
                }
                stack.push(curr);
            }
        }

        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }

}
