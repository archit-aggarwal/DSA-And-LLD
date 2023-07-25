// https://practice.geeksforgeeks.org/problems/selection-sort/1

// time = O(n^2) ; space = O(1) ; stable = NO;

class Solution {
    public void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public int compare(int[] arr, int l, int r) {
        if (arr[l] > arr[r])
            return -1; // swap not required
        if (arr[l] < arr[r])
            return +1; // swap required
        else
            return 0; // equal -> swap not required
    }

    void selectionSort(int arr[], int n) {
        for (int pass = 0; pass < n - 1; pass++) { // pass
            int min = pass;
            for (int comp = pass; comp < n; comp++) { // comparison
                if (compare(arr, comp, min) > 0) {
                    min = comp;
                }
            }
            if (min != pass) { // this is not for best case optimization
                swap(arr, pass, min);
            }
        }
    }
}