// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

// Time complexity: O(N) Space complexity: O(1)

class Solution9 {
    public int[] searchRange(int[] arr, int target) {
        int firstIndex = -1, lastIndex = -1;
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] == target) {
                lastIndex = idx;
                if (firstIndex == -1) {
                    firstIndex = idx;
                }
            }
        }
        int[] ans = { firstIndex, lastIndex };
        return ans;
    }
}