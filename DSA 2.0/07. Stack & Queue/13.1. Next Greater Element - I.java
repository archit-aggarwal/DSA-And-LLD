import java.util.*;
// https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1
// Time = O(N), Space = O(N) Stack Space

class Solution {
    public static long[] nextLargerElement(long[] arr, int n) {
        long[] nge = new long[n];
        Arrays.fill(nge, -1l);

        Stack<Integer> stk = new Stack<>();

        for (int idx = 0; idx < n; idx++) {
            while (stk.size() > 0 && arr[idx] > arr[stk.peek()]) {
                nge[stk.pop()] = arr[idx];
            }
            stk.push(idx);
        }

        return nge;
    }
}