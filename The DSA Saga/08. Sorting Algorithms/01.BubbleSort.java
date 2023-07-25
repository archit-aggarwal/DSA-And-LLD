// https://practice.geeksforgeeks.org/problems/bubble-sort/1

// time = O(n^2) ; space = O(1) ; stable = YES;

class Solution {
    public static int compare(int[] arr, int l, int r) {
        if (arr[l] > arr[r])
            return +1; // swap required
        if (arr[l] < arr[r])
            return -1; // swap not required
        else
            return 0; // equal so swap not required

    }

    public static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void bubbleSort(int arr[], int n) {
        for (int pass = 0; pass < n - 1; pass++) { // pass
            int swapCounts = 0;
            for (int comp = 0; comp < n - pass - 1; comp++) { // comparison
                if (compare(arr, comp, comp + 1) > 0) {
                    swap(arr, comp, comp + 1);
                    swapCounts++;
                }
            }
            if (swapCounts == 0)
                break; // for best case optimization
        }
    }
}