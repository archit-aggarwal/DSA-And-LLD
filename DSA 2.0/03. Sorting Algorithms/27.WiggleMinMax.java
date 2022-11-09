// https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1

class Solution {
    // approach 1: Time = O(N) Assuming Already Sorted
    // Space = O(N) Not Inplace
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

    // approach 2: Storing 2 Values at Same Index
    // Time = O(N), Space = O(1) Inplace Constant
    public static void quotientRemainder(long[] arr, int n) {
        long max = 10000001;
        int left = 0, right = n - 1;

        // Encryption
        for (int idx = 0; idx < n; idx++) {
            long oldVal = arr[idx];
            long newVal = (idx % 2 == 0)
                    ? arr[right--] % max
                    : arr[left++] % max;

            arr[idx] = oldVal + (newVal % max) * max;
        }

        // Decryption
        for (int idx = 0; idx < n; idx++) {
            arr[idx] = arr[idx] / max;
        }
    }

    public static void rearrange(long arr[], int n) {
        // minMaxForm(arr, n);
        quotientRemainder(arr, n);
    }

}