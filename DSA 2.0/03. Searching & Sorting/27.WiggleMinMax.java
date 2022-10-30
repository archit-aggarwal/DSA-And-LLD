// https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1

class Solution {
    // approach 1: Time = O(N) Assuming Already Sorted, Space = O(N) Not Inplace
    public static void minMaxForm(long arr[], int n) {
        long[] sorted = new long[n];
        for (int idx = 0; idx < n; idx++)
            sorted[idx] = arr[idx];

        int left = 0, right = arr.length - 1;

        for (int idx = 0; idx < n; idx++) {
            if (idx % 2 == 1) {
                arr[idx] = sorted[left];
                left++;
            } else {
                arr[idx] = sorted[right];
                right--;
            }
        }
    }

    public static void rearrange(long arr[], int n) {
        minMaxForm(arr, n);
    }

}