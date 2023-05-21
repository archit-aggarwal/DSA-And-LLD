import java.util.*;

// Time: () - Space ()

class Solution18 {
    // APPROACH : 1
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] suffix = new int[n];
        suffix[n - 1] = nums[n - 1];

        for (int idx = n - 2; idx >= 0; idx--) {
            suffix[idx] = nums[idx] + suffix[idx + 1];
        }
        return suffix;
    }

    // APPROACH : 2
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] suffix = new int[n];

        for (int idx = n - 1; idx >= 0; idx--) {
            suffix[idx] = nums[idx] + ((idx < n - 1) ? suffix[idx + 1] : 0);
        }
        return suffix;
    }
}