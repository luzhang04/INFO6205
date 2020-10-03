// Leetcode 735
package Week2;

import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int nums: asteroids) {
            if(nums > 0) {
                stack.push(nums);
            }
            else {
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -nums) {
                    stack.pop();
                }
                if(!stack.isEmpty() && stack.peek() > 0 && stack.peek() == -nums) {
                    stack.pop();
                }
                else {
                    if(stack.isEmpty() || stack.peek() < 0 ) {
                        stack.push(nums);
                    }
                }
            }
        }

        int[] res= new int[stack.size()];
        for(int i = res.length-1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}
