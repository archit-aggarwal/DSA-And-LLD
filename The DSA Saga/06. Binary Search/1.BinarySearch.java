// https://leetcode.com/problems/binary-search/

// time = O(log n)  ; space = O(1);

class Solution1 {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
                // discard left to mid region
            } else {
                right = mid - 1;
                // discard mid to right region
            }
        }

        return -1; // search unsuccessful
    }
}