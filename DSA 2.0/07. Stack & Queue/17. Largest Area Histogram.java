import java.util.*;
// Time = O(n), Space = O(n)
// https://leetcode.com/problems/largest-rectangle-in-histogram/description/

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
            while (stk.size() > 0 && arr[stk.peek()] >= arr[idx]) {
                stk.pop();
            }
            res[idx] = (stk.size() > 0) ? stk.peek() : -1;
            stk.push(idx);
        }

        return res;
    }

    public int largestRectangleArea(int[] arr) {
        int[] left = leftNSE(arr);
        int[] right = rightNSE(arr);
        int max = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            int area = arr[idx] * (right[idx] - left[idx] - 1);
            max = Math.max(max, area);
        }
        return max;
    }
}