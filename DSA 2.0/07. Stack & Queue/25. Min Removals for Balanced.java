import java.util.*;
// https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/description/
// Time = O(N), Space = O(N)

class Solution {
    public String minRemoveToMakeValid(String s) {
        boolean[] unbalanced = new boolean[s.length()];

        Stack<Integer> stk = new Stack<>();
        for (int idx = 0; idx < s.length(); idx++) {
            if (s.charAt(idx) == '(') {
                stk.push(idx);
                unbalanced[idx] = true;
            } else if (s.charAt(idx) == ')') {
                if (stk.size() > 0) {
                    unbalanced[stk.pop()] = false;
                } else {
                    unbalanced[idx] = true;
                }
            }
        }

        StringBuilder res = new StringBuilder();
        for (int idx = 0; idx < s.length(); idx++) {
            if (unbalanced[idx] == false) {
                res.append(s.charAt(idx));
            }
        }
        return res.toString();
    }
}