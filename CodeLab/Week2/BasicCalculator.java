// Leetcode 224
package Week2;

import java.util.Stack;

public class BasicCalculator {
    public int basicCalculate(String s) {
        int result = 0;
        int sign = 1;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < s.length(); i++ ) {
            if(Character.isDigit(s.charAt(i))) {
                int start = i;
                i++;
                while(i < s.length() && Character.isDigit(s.charAt(i))) {
                    i++;
                }
                result += sign * Integer.valueOf(s.substring(start, i));
                i--;
            } else if(s.charAt(i) == '-') {
                sign = -1;
            } else if(s.charAt(i) == '+') {
                sign = 1;
            } else if(s.charAt(i) == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if(s.charAt(i) == ')') {
                result = stack.pop() * result + stack.pop();
            }
        }
        return result;
    }
}
