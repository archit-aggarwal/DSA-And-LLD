// https://practice.geeksforgeeks.org/problems/print-elements-of-array4910/1

// time = O(n) ; space = O(n)

class Solution {
    void helperFunction(int[] arr, int idx) {
        // base case
        if (idx == arr.length) {
            return;
        }

        // remaining work
        System.out.print(arr[idx] + " ");

        // faith: recursive call
        helperFunction(arr, idx + 1);

    }

    void printArray(int arr[], int n) {
        helperFunction(arr, 0);
    }
}