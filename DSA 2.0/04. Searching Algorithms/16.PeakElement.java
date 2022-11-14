// https://leetcode.com/problems/find-peak-element/description/
// Leetcode 162
// Time = O(log2 N), Space = O(1)

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 1, right = arr.length - 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public int findPeakElement(int[] arr) {
        int n = arr.length;
        if (n == 1 || arr[0] > arr[1])
            return 0;
        if (arr[n - 1] > arr[n - 2])
            return n - 1;
        return peakIndexInMountainArray(arr);
    }
}