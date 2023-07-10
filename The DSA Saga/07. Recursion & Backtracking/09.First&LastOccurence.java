// https://practice.geeksforgeeks.org/problems/find-index4752/1

// time = O(n) ; space = O(n) ;

class Solution {
    static int[] linearSearch(int[] arr, int target, int idx) {
        // base case: empty array: target not found
        if (idx == arr.length)
            return new int[] { -1, -1 };

        // faith: recursive call
        int[] ans = linearSearch(arr, target, idx + 1);

        // remaining work
        if (arr[idx] == target) {
            if (ans[0] == -1) {
                // first and last occurence
                ans[0] = ans[1] = idx;
            } else {
                // first occurence
                ans[0] = idx;
            }
        }

        return ans; // current element is not equal to target
    }

    static int[] findIndex(int arr[], int N, int target) {
        return linearSearch(arr, target, 0);
    }
}