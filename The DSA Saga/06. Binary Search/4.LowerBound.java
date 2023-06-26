// https://leetcode.com/problems/search-insert-position/description/

// time = O(log n base 2) ; space = O(1);

class Solution4 {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        // lower bound
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                // first occurence
                right = mid - 1;

            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
