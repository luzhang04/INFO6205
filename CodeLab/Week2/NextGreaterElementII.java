// Leetcode 503
package Week2;

public class NextGreaterElementII {
    public int[] nextGreaterElementII(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            boolean f = false;
            for (int m = 0; m < nums.length; m++) {
                if (j >= nums.length) {
                    j = 0;
                }
                if (nums[j] > nums[i]) {
                    res[i] = nums[j];
                    f = true;
                    break;
                }
                j++;
            }
            if (! f) {
                res[i] = -1;
            }
        }
        return res;
    }
}
