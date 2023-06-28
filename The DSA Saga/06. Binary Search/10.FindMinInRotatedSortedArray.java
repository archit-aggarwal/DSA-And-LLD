// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

// time = O(log n) ; space = O(1);

class Solution10 {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        if (nums[left] <= nums[right]) {
            // corner case: completely sorted (not rotated at all)
            return nums[0];
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= nums[0]) {
                // greater region (unrotated)
                left = mid + 1;
            } else {
                // lesser region (rotated)
                right = mid - 1;
            }
        }
        return nums[left];

    }
}