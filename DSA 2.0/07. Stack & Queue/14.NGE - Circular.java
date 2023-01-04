import java.util.*;
// https://leetcode.com/problems/next-greater-element-ii/description/
// Time = O(N), Space = O(N)

class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Arrays.fill(nge, -1);
        Stack<Integer> stk = new Stack<>();

        for (int idx = 0; idx < n; idx++) {
            while (stk.size() > 0 && arr[idx] > arr[stk.peek()]) {
                nge[stk.pop()] = arr[idx];
            }
            stk.push(idx);
        }

        for (int idx = 0; idx < n; idx++) {
            while (stk.size() > 0 && arr[idx] > arr[stk.peek()]) {
                nge[stk.pop()] = arr[idx];
            }
        }

        return nge;
    }
}