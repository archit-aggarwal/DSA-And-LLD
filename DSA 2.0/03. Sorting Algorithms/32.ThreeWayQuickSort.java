// https://leetcode.com/problems/sort-an-array/description/
// Time = O(N Log N) Best/Average Case, O(N ^ 2) Worst Case
// Space = O(1) Extra/Auxiliary = Inplace
// O(Log N) Average, O(N) Worst Recursion Space
// Not Stable (Relative order not maintained)

class Solution {
    public void swap(int[] nums, int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }

    public void randomize(int[] nums, int start, int end) {
        int randomIdx = (int) (Math.random() * (end - start + 1) + start);
        swap(nums, randomIdx, end);
    }

    public int[] partition(int[] arr, int start, int end) {
        int left = start, mid = start, right = end;

        randomize(arr, start, end);
        int pivot = arr[end];

        while (mid <= right) {
            if (arr[mid] < pivot) {
                swap(arr, left, mid);
                left++;
                mid++;
            } else if (arr[mid] == pivot) {
                mid++;
            } else {
                swap(arr, right, mid);
                right--;
            }
        }

        return new int[] { left, right };
        // first & last occurence of pivot
    }

    public void quickSort(int[] nums, int start, int end) {
        if (start >= end)
            return;
        // either 0 elements or 1 array: already sorted

        int[] pivot = partition(nums, start, end);
        int firstOcc = pivot[0], lastOcc = pivot[1];

        quickSort(nums, start, firstOcc - 1);
        quickSort(nums, lastOcc + 1, end);
    }

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
}