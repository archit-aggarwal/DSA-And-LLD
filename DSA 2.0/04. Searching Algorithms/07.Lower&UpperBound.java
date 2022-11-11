// Lower Bound: Search Insert Position: Leetcode 35
// https://leetcode.com/problems/search-insert-position/description/

// Time = O(log2 N), Space = O(1)

class Solution {
    public static int lowerBound(int[] nums, int target) {
        // Same as First Occurence
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return left;
    }

    public static int upperBound(int[] nums, int target) {
        // Same as Ceil Value
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return left;
    }
}