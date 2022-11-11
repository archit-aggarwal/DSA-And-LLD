// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
// Time = O(log2 N), Space = O(1)

class Solution {
    int firstOccurence(int[] nums, int target) {
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

    int lastOccurence(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }

        return right;
    }

    public int[] searchRange(int[] nums, int target) {
        int fi = firstOccurence(nums, target);
        int li = lastOccurence(nums, target);

        if (fi > li)
            return new int[] { -1, -1 };
        return new int[] { fi, li };
    }
}