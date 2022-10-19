// Merge 2 Sorted Arrays Without Extra Space

// GeeksforGeeks: Insertion Sort
// https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1
// Time = O(n ^ 2), Space = O(1)
class Solution1 {
    public static void swap(long[] arr1, long[] arr2, int i1, int i2) {
        long temp1 = get(arr1, arr2, i1);
        long temp2 = get(arr1, arr2, i2);

        set(arr1, arr2, i1, temp2);
        set(arr1, arr2, i2, temp1);
    }

    public static void set(long[] arr1, long[] arr2, int idx, long val) {
        if (idx < arr1.length)
            arr1[idx] = val;
        else
            arr2[idx - arr1.length] = val;
    }

    public static long get(long[] arr1, long[] arr2, int idx) {
        if (idx < arr1.length)
            return arr1[idx];
        return arr2[idx - arr1.length];
    }

    public static void merge(long arr1[], long arr2[], int n, int m) {
        for (int i = arr1.length; i < arr1.length + arr2.length; i++) {
            for (int j = i; j > 0; j--) {
                if (get(arr1, arr2, j) < get(arr1, arr2, j - 1)) {
                    swap(arr1, arr2, j, j - 1);
                } else
                    break;
            }
        }
    }
}

// Leetcode: Shell Sort
// 88: https://leetcode.com/problems/merge-sorted-array/
// Time = O(N Log N), Space = O(1)
class Solution2 {
    public void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // fill second array elements in empty blocks in first array
        for (int idx = 0; idx < nums2.length; idx++) {
            nums1[m + idx] = nums2[idx];
        }

        // Shell Sort (Gap Strategy)
        for (double gap = (m + n) / 2.0; gap >= 1.0; gap = gap / 2.0) {
            int ceil = (int) Math.ceil(gap);
            gap = ceil;

            for (int i = 0; i + ceil < m + n; i++) {
                if (nums1[i] > nums1[i + ceil]) {
                    swap(nums1, i, i + ceil);
                }
            }
        }
    }
}