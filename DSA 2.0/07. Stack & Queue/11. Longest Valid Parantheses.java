import java.util.*;
// https://leetcode.com/problems/longest-valid-parentheses/description
// Time = O(N), Space = O(N)

class Solution {
    public int longestValidParentheses(String s) {
        int[] res = new int[s.length()];
        Stack<Integer> stk = new Stack<>();

        int max = 0;
        for (int idx = 0; idx < s.length(); idx++) {
            if (s.charAt(idx) == '(') {
                stk.push(idx);
            } else {
                if (stk.size() == 0)
                    continue;
                int open = stk.pop();
                res[idx] += (idx - open + 1);
                if (open > 0)
                    res[idx] += res[open - 1];
                max = Math.max(max, res[idx]);
            }
        }

        return max;
    }
}