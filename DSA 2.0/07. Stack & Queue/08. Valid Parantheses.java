import java.util.*;
// https://leetcode.com/problems/valid-parentheses/
// Time = O(N), Space = O(N)

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for (int idx = 0; idx < s.length(); idx++) {
            char ch = s.charAt(idx);

            if (ch == '}') {
                // extra closing characters || type is mismatch
                if (stk.size() == 0 || stk.peek() != '{')
                    return false;
                stk.pop();

            } else if (ch == ']') {
                if (stk.size() == 0 || stk.peek() != '[')
                    return false;
                stk.pop();

            } else if (ch == ')') {
                if (stk.size() == 0 || stk.peek() != '(')
                    return false;
                stk.pop();

            } else
                stk.push(ch);
        }

        if (stk.size() > 0)
            return false; // extra opening characters
        return true;
    }
}