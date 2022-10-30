// With Relative Order
// https://leetcode.com/problems/partition-array-according-to-given-pivot/description/
// Time = O(N), Space = O(N)

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        int left = 0, right = nums.length - 1;

        // < pivot
        for (int idx = 0; idx < nums.length; idx++) {
            if (nums[idx] < pivot) {
                res[left] = nums[idx];
                left++;
            }
        }

        // > pivot
        for (int idx = nums.length - 1; idx >= 0; idx--) {
            if (nums[idx] > pivot) {
                res[right] = nums[idx];
                right--;
            }
        }

        // = pivot
        for (int idx = left; idx <= right; idx++) {
            res[idx] = pivot;
        }
        return res;
    }
}