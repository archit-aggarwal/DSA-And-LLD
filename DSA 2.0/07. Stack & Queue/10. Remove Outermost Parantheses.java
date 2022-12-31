import java.util.*;
// https://leetcode.com/problems/remove-outermost-parentheses/description/
// Time = O(N), Space = O(N) Stack, Boolean Array

class Solution {
    public String removeOuterParentheses(String s) {
        boolean[] isOuter = new boolean[s.length()];

        Stack<Integer> stk = new Stack<>();
        for (int idx = 0; idx < s.length(); idx++) {
            if (s.charAt(idx) == '(') {
                stk.push(idx);
            } else {
                int open = stk.pop();
                if (stk.size() == 0) {
                    // remove outermost
                    isOuter[idx] = isOuter[open] = true;
                }
            }
        }

        StringBuilder res = new StringBuilder();
        for (int idx = 0; idx < s.length(); idx++) {
            if (isOuter[idx] == false) {
                res.append(s.charAt(idx));
            }
        }
        return res.toString();
    }
}
