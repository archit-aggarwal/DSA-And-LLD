// leetcode 704: 
// https://leetcode.com/problems/binary-search/description/

// Time = O(Log2 N), Space = O(1) Inplace

class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target)
                return mid; // successful search
            else if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1; // unsuccessful search
    }
}