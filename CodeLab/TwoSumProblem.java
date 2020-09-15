//Two Sum Problem: Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.


import java.util.Arrays;

public class TwoSumProblem {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5};
        int target = 5;

        int[] indices = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                }
                else {
                    System.out.println("No such indices");
                }
            }
        }
        System.out.println(Arrays.toString(indices));
    }

}
