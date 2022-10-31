// https://practice.geeksforgeeks.org/problems/rearrange-an-array-with-o1-extra-space3142/1

class Solution {
    // Time = O(N), Space = O(N)
    static void approach1(long arr[], int n) {
        long[] inv = new long[n];

        for (int idx = 0; idx < n; idx++) {
            inv[idx] = arr[(int) arr[idx]];
        }

        for (int idx = 0; idx < n; idx++) {
            arr[idx] = inv[idx];
        }
    }

    // Quotient Remainder Method
    // Time = O(N), Space = O(1) Inplace
    static void approach2(long arr[], int n) {
        for (int idx = 0; idx < n; idx++) {
            long oldVal = arr[idx] % n;
            long newVal = arr[(int) arr[idx]] % n;
            arr[idx] = oldVal + (newVal % n) * n;
        }

        for (int idx = 0; idx < n; idx++) {
            arr[idx] = arr[idx] / n;
        }
    }

    static void arrange(long arr[], int n) {
        // approach1(arr, n);
        approach2(arr, n);
    }
}