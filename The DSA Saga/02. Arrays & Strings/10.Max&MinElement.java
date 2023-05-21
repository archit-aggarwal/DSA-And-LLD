// https://www.interviewbit.com/problems/max-min-05542f2f-69aa-4253-9cc7-84eb7bf739c4/

// Time complexity: O(N) Space complexity: O(1)

class Solution10 {
    // APPROACH : 1
    public int solve(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] < min) {
                min = arr[idx];
            }
            if (arr[idx] > max) {
                max = arr[idx];
            }
        }
        return (min + max);
    }

    // APPROACH : 2

    // public int solve(int[] arr) {
    // int minimum = Integer.MAX_VALUE;
    // int maximum = Integer.MIN_VALUE;
    // for (int idx = 0; idx < arr.length; idx++) {
    // minimum = Math.min(minimum , arr[idx]);
    // maximum = Math.max(maximum , arr[idx]);
    // }
    // return (minimum + maximum);
    // }
}