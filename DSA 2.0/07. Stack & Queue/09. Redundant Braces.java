import java.util.*;
// https://practice.geeksforgeeks.org/problems/e015cb4d3f354b035d9665e7c8a54a7aefb1901b/1
// Time = O(N), Space = O(N)

class Solution {
    public static int checkRedundancy(String s) {
        Stack<Character> stk = new Stack<>();

        for (int idx = 0; idx < s.length(); idx++) {
            char ch = s.charAt(idx);

            if (ch == ')') {
                int count = 0;
                while (stk.peek() != '(') {
                    count++;
                    stk.pop();
                }
                stk.pop(); // opening ( popped

                if (count <= 1)
                    return 1; // redundant
            } else {
                stk.push(ch);
            }
        }

        return 0;
    }
}