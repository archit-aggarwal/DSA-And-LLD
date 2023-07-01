// https://www.codingninjas.com/studio/problems/ceiling-in-a-sorted-array_1825401

// time = O(log n base 2) ; space = O(1); 

class Solution5 {
    public static int ceilingInSortedArray(int n, int target, int[] nums) {
        int left = 0, right = nums.length - 1;

        // ceil or upper bound
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {

                left = mid + 1;

            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}