// Leetcode 75: https://leetcode.com/problems/sort-colors/description/
// Time = O(N) Linear Single Traversal
// Space = O(1) Constant Inplace

class Solution {
    public void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }

    public void sortColors(int[] nums) {
        int left = 0, mid = 0, right = nums.length - 1;

        while (mid <= right) {
            if (nums[mid] == 0) {
                swap(nums, left, mid);
                left++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, right, mid);
                right--;
            }
        }
    }
}