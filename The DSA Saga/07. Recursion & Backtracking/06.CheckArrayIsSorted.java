// https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1

// time = O(n) ; space = O(n) ;

class Solution {
    boolean checkSorted(int[] arr, int idx) {
        // base case
        if (idx == arr.length - 1) {
            return true;
        }

        // remaining work
        if (arr[idx] > arr[idx + 1]) {
            return false;
        }

        // faith: recursive call
        return checkSorted(arr, idx + 1);
    }

    boolean arraySortedOrNot(int[] arr, int n) {
        return checkSorted(arr, 0);
    }
}
