// https://practice.geeksforgeeks.org/problems/heap-sort/1
// Heap Sort: Time = O(N * Log N), Space = O(1)
// In-Place but Not Stable
class Solution {
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void downheapify(int[] arr, int n, int idx) {
        int li = 2 * idx + 1;
        int ri = 2 * idx + 2;

        int max = idx;
        if (li < n && arr[li] > arr[max])
            max = li;
        if (ri < n && arr[ri] > arr[max])
            max = ri;

        if (max == idx)
            return;
        swap(arr, idx, max);
        downheapify(arr, n, max);
    }

    public void heapSort(int arr[], int n) {
        for (int i = n - 1; i >= 0; i--)
            downheapify(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            swap(arr, 0, i);
            downheapify(arr, i, 0);
        }
    }
}