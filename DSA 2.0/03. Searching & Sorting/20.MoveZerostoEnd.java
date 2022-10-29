// https://leetcode.com/problems/move-zeroes/description/
// Time = O(N), Space = O(1)

class Solution {
    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public void moveZeroes(int[] nums) {
        int left = 0, right = 0;

        while (right < nums.length) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
                right++;
            } else {
                right++;
            }
        }
    }
}