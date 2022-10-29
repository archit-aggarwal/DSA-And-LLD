// https://leetcode.com/problems/sort-array-by-parity/description/
// Time = O(N), Space = O(1)
// Relative Order Not Maintained

class Solution {
    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = 0;

        while (right < nums.length) {
            if (nums[right] % 2 == 0) {
                swap(nums, left, right);
                left++;
                right++;
            } else {
                right++;
            }
        }

        return nums;
    }
}