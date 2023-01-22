// https://practice.geeksforgeeks.org/problems/find-index4752/1

// Approach 1: Two Traversal Approach 
// Time = O(N), Space = O(N)
class Solution1 {
    static int firstIndex(int[] arr, int idx, int key) {
        if (idx == arr.length)
            return -1; // empty array
        if (arr[idx] == key)
            return idx; // leftmost
        return firstIndex(arr, idx + 1, key);
    }

    static int lastIndex(int[] arr, int idx, int key) {
        if (idx == -1)
            return -1; // empty array
        if (arr[idx] == key)
            return idx; // rightmost
        return lastIndex(arr, idx - 1, key);
    }

    static int[] findIndex(int a[], int N, int key) {
        int fi = firstIndex(a, 0, key);
        int li = lastIndex(a, N - 1, key);
        return new int[] { fi, li };
    }
}

// Single Pass Algorithm
// Time = O(N), Space = O(N)

class Solution2 {
    static int[] search(int[] arr, int idx, int key) {
        if (idx == arr.length)
            return new int[] { -1, -1 };
        int[] ans = search(arr, idx + 1, key);
        if (arr[idx] == key) {
            ans[0] = idx; // leftmost = first index
            ans[1] = Math.max(ans[1], idx); // rightmost = last index
        }
        return ans;
    }

    static int[] findIndex(int a[], int N, int key) {
        return search(a, 0, key);
    }
}