// https://practice.geeksforgeeks.org/problems/insertion-sort/1

// time = O(n^2) ; space = O(1) ; stable = yes

class Solution3 {
    public void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public int compare(int[] arr, int l, int r) {
        if (arr[l] < arr[r])
            return -1; // swap not required
        if (arr[l] > arr[r])
            return +1; // swap required
        else
            return 0; // equal -> swap not required
    }

    public void insertionSort(int arr[], int n) {
        for (int i = 1; i < n; i++) { // pass
            for (int j = i; j > 0; j--) { // compare
                if (compare(arr, j - 1, j) > 0) {
                    swap(arr, j - 1, j);
                } else
                    break; // for best case optimization
            }
        }
    }
}