// Leetcode 155
package Week2;

import java.util.Stack;

public class MinStack {
    Stack<int[]> stack = new Stack<>();
    public MinStack() {

    }
    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(new int[]{x, x});
            return;
        }
        int curMin = stack.peek()[1];
        stack.push(new int[] {x, Math.min(x, curMin)});
    }
    public void pop() {
        stack.pop();
    }
    public int top() {
        return stack.peek()[0];
    }
    public int getMin() {
        return stack.peek()[1];
    }
}
