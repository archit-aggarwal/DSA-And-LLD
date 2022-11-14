// https://www.interviewbit.com/problems/search-in-bitonic-array/
// Time = O(logN), Space = O(1)

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

    public int binarySearchInc(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public int binarySearchDec(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public int solve(int[] arr, int target) {
        int peakIdx = peakIndexInMountainArray(arr);

        int lans = binarySearchInc(arr, 0, peakIdx, target);
        if (lans != -1)
            return lans;

        return binarySearchDec(arr, peakIdx + 1, arr.length - 1, target);
    }
}
