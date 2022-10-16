// Leetcode 977: https://leetcode.com/problems/squares-of-a-sorted-array/
// Time: O(N), Space: O(N) Extra Space

class Solution {
    public int middlePoint(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0)
                return i;
        }
        return nums.length;
    }

    public int[] sortedSquares(int[] nums) {
        int right = middlePoint(nums);
        int left = right - 1, idx = 0;

        int[] res = new int[nums.length];

        while (left >= 0 && right < nums.length) {
            if (nums[left] * nums[left] <= nums[right] * nums[right]) {
                res[idx] = nums[left] * nums[left];
                idx++;
                left--;
            } else {
                res[idx] = nums[right] * nums[right];
                idx++;
                right++;
            }
        }

        while (left >= 0) {
            res[idx] = nums[left] * nums[left];
            idx++;
            left--;
        }

        while (right < nums.length) {
            res[idx] = nums[right] * nums[right];
            idx++;
            right++;
        }

        return res;
    }
}