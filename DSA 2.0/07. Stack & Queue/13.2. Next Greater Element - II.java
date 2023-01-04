import java.util.*;
// https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1
// Time = O(N), Space = O(N) Stack Space

class Solution {
    public static long[] nextLargerElement(long[] arr, int n) {
        long[] nge = new long[n];
        Stack<Integer> stk = new Stack<>();

        for (int idx = n - 1; idx >= 0; idx--) {
            while (stk.size() > 0 && arr[idx] >= arr[stk.peek()]) {
                stk.pop();
            }

            if (stk.size() > 0)
                nge[idx] = arr[stk.peek()];
            else
                nge[idx] = -1l;
            stk.push(idx);
        }

        return nge;
    }
}