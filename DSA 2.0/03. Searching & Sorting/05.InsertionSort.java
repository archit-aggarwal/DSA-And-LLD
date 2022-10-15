// GfG: https://practice.geeksforgeeks.org/problems/insertion-sort/1
// Time: Best Case: O(N), Avg Case / Worst Case: O(N ^ 2)
// Space: O(1) Constant or Inplace
// Stable Sorting Algorithm

class Solution {
    public void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    public void insertionSort(int arr[], int n) {
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                } else
                    break;
            }
        }
    }
}