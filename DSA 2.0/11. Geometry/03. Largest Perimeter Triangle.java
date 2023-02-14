import java.util.*;
// https://leetcode.com/problems/largest-perimeter-triangle/description/
// Time = O(NlogN), Space = O(1)

class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = n - 3, j = n - 2, k = n - 1;

        while (i >= 0) {
            if (nums[i] + nums[j] > nums[k])
                return nums[i] + nums[j] + nums[k];
            i--;
            j--;
            k--;
        }

        return 0;
    }
}