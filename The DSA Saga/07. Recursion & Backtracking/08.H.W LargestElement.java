// https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/0

// time = O(n) ; space = O(n);

class Solution {
    public int findMax(int[] arr, int idx) {
        // base case
        if (idx == arr.length) {
            return Integer.MIN_VALUE;
        }

        // faith: recursive call
        int sans = findMax(arr, idx + 1);

        // remaining work
        int bans = Math.max(arr[idx], sans);

        return bans;

    }

    public int largest(int arr[], int n) {
        return findMax(arr, 0);
    }
}