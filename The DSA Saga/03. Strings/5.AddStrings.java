// https://leetcode.com/problems/add-strings/description/

import java.util.*;

class Solution5 {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int p1 = num1.length() - 1, p2 = num2.length() - 1;
        int carry = 0;

        while (p1 >= 0 || p2 >= 0 || carry > 0) {
            int d1 = (p1 >= 0) ? num1.charAt(p1) - '0' : 0;
            int d2 = (p2 >= 0) ? num2.charAt(p2) - '0' : 0;
            int sum = d1 + d2 + carry;

            carry = sum / 10;
            res.append(sum % 10);
            p1--;
            p2--;
        }
        return res.reverse().toString();
    }
}