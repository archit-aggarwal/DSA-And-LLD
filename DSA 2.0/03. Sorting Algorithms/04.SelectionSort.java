// https://practice.geeksforgeeks.org/problems/selection-sort/1
// Worst Case, Average Case, Best Case: O(N ^ 2) Time
// Space Complexity: O(1) No Extra/Constant Extra Space
// Not Stable Algorithm

class Solution {
    void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    void selectionSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);
        }
    }
}