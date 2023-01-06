import java.util.*;
// https://leetcode.com/problems/sum-of-subarray-minimums/description/
// Time = O(N), Space = O(N)

class Solution {
    public int[] rightNSE(int[] arr) {
        int n = arr.length;
        Stack<Integer> stk = new Stack<>();
        int[] res = new int[n];

        for (int idx = n - 1; idx >= 0; idx--) {
            while (stk.size() > 0 && arr[stk.peek()] >= arr[idx]) {
                stk.pop();
            }
            res[idx] = (stk.size() > 0) ? stk.peek() : n;
            stk.push(idx);
        }

        return res;
    }

    public int[] leftNSE(int[] arr) {
        int n = arr.length;
        Stack<Integer> stk = new Stack<>();
        int[] res = new int[n];

        for (int idx = 0; idx < n; idx++) {
            while (stk.size() > 0 && arr[stk.peek()] > arr[idx]) {
                stk.pop();
            }
            res[idx] = (stk.size() > 0) ? stk.peek() : -1;
            stk.push(idx);
        }

        return res;
    }

    public int sumSubarrayMins(int[] nums) {
        int[] left = leftNSE(nums);
        int[] right = rightNSE(nums);
        long ans = 0;

        for (int curr = 0; curr < nums.length; curr++) {
            long count = (right[curr] - curr) * (curr - left[curr]);
            ans = (ans + (count * nums[curr]) % 1000000007) % 1000000007;
        }

        return (int) ans;
    }
}

