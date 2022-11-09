// https://practice.geeksforgeeks.org/problems/binary-array-sorting-1587115620/1
// Time = O(N), Space = O(1)
// Single Traversal Approach & Inplace Approach

class Solution {
    static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    static void binSort(int arr[], int N) {
        int left = 0, right = 0;
        while (right < N) {
            if (arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right++;
            } else {
                right++;
            }
        }
    }
}
