// https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1
// Time = O(N), Space = O(N) Recursion

class Solution {
    boolean isSorted(int[] arr, int idx) {
        if (idx >= arr.length - 1)
            return true;
        boolean sans = isSorted(arr, idx + 1);
        return sans && (arr[idx] <= arr[idx + 1]);
    }

    boolean arraySortedOrNot(int[] arr, int n) {
        return isSorted(arr, 0);
    }
}