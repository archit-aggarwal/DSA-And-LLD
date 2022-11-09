// GfG: https://practice.geeksforgeeks.org/problems/merge-sort/1
// Time = O(N * Log N), Space = O(N) Extra Space (Not Inplace)
// Stable Sorting algorithm
class Solution {
    public void merge(int[] arr, int left, int mid, int right) {
        int[] res = new int[right - left + 1];
        int idx1 = left, idx2 = mid + 1, idx3 = 0;

        while (idx1 <= mid && idx2 <= right) {
            if (arr[idx1] <= arr[idx2]) {
                res[idx3] = arr[idx1];
                idx1++;
                idx3++;
            } else {
                res[idx3] = arr[idx2];
                idx2++;
                idx3++;
            }
        }

        while (idx1 <= mid) {
            res[idx3] = arr[idx1];
            idx1++;
            idx3++;
        }

        while (idx2 <= right) {
            res[idx3] = arr[idx2];
            idx2++;
            idx3++;
        }

        for (int idx = left; idx <= right; idx++) {
            arr[idx] = res[idx - left];
        }
    }

    void mergeSort(int nums[], int l, int r) {
        if (l == r)
            return;

        int mid = (l + r) / 2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, r);
        merge(nums, l, mid, r);
    }
}
