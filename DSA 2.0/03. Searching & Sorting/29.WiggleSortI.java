// Time = O(N), Space = O(1) Constant Inplace

// Wiggle Sort 1 Leetcode Locked: Coding Ninjas
// Duplicates Allowed & Adjacent Equal Allowed
// https://www.codingninjas.com/codestudio/problems/wiggle-sort_3155169?leftPanelTab=1

// GfG Variation
// No Duplicates
// https://practice.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1

class Solution {
    public static void swap(int[] arr, int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }

    public static int[] wiggleSort(int n, int[] arr) {
        for (int idx = 0; idx < n; idx = idx + 2) { // valley indices
            if (idx - 1 >= 0 && arr[idx - 1] < arr[idx]) {
                swap(arr, idx - 1, idx);
            }

            if (idx + 1 < n && arr[idx + 1] < arr[idx]) {
                swap(arr, idx + 1, idx);
            }
        }

        return arr;
    }
}