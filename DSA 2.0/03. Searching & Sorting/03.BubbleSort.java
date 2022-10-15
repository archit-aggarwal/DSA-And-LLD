// GfG: https://practice.geeksforgeeks.org/problems/bubble-sort/1

// Time: Best Case: O(N^2) Without Optimization, Avg Case/Worst Case: O(N ^ 2)
// Space: O(1) Constant Extra Space: Inplace Sorting
// Stable Sorting Algorithm

class Solution1 {
    public static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    public static void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
}

// Time: Best Case: O(N) With Optimization, Avg Case/Worst Case: O(N ^ 2)
class Solution2 {
    public static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    public static void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int count = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    count++;
                    swap(arr, j, j + 1);
                }
            }
            if (count == 0)
                break;
        }
    }
}