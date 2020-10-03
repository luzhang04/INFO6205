// Leetcode 496
package Week2;

public class NextGreaterElementI {
    public int[] nextGreaterElementI(int[] nums1, int[] nums2) {
        int[] res = new int[nums2.length];
        for (int i = 0; i < nums2.length; i++) {
            for (int j = 0; j < nums1.length; j++) {
                if (nums1[i] == nums2[j]) {
                    for (int m = j; m < nums2.length; m++) {
                        if (nums2[m] > nums2[j]) {
                            res[i] = nums2[m];
                            break;
                        }
                        else {
                            res[i] = -1;
                        }
                    }
                }
            }
        }
        return res;
    }
}
