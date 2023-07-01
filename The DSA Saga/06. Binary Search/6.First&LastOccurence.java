// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

// time = O(2logn) ; space = O(1);

class Solution {
    public int firstOccurence(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                // first occurence -> left
                right = mid - 1;

            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public int lastOccurence(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                // last occurence -> right
                left = mid + 1;

            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
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