// https://leetcode.com/problems/peak-index-in-a-mountain-array/

// time = O(log n) ; space = O(1);

class Solution12 {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 1, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                // peak (greater than both neighbours)
                return mid;
            } else if (arr[mid] > arr[mid - 1]) {
                // uphill
                left = mid + 1;
            } else {
                // downhill
                right = mid - 1;
            }
        }
        return -1;
    }
}