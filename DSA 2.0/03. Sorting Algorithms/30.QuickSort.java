// Leetcode 912: https://leetcode.com/problems/sort-an-array/description/
// Time Limit Exceeded
// Time = O(N Log N) Best/Average Case, O(N ^ 2) Worst Case
// Space = O(1) Extra/Auxiliary = Inplace
// O(Log N) Average, O(N) Worst Recursion Space
// Not Stable (Relative order not maintained)

class Solution {
    public int partition(int[] nums, int start, int end) {
        int pivot = nums[end];

        int left = start, right = start;
        while (right <= end) {
            if (nums[right] <= pivot) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right++;
            } else {
                right++;
            }
        }

        return left - 1; // this is the last index of <= region
    }

    public void quickSort(int[] nums, int start, int end) {
        if (start >= end)
            return;
        // either 0 elements or 1 array: already sorted

        int pivot = partition(nums, start, end);
        quickSort(nums, start, pivot - 1);
        quickSort(nums, pivot + 1, end);
    }

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
}