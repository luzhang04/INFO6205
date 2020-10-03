// Leetcode 456
package Week2;

import java.util.Stack;

public class Find132Pattern {
    public boolean find132pattern(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }
        int[] min = new int[nums.length];
        min[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            min[i] = Math.min(min[i - 1], nums[i]);
        }
        Stack<Integer> stack = new Stack<>();
        int max = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > min[i]) {
                while (!stack.isEmpty() && stack.peek() < nums[i]) {
                    max = stack.pop();
                }
                if (max > min[i]) {
                    return true;
                }
            }
            stack.push(nums[i]);
        }
        return false;
    }
}
