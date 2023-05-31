// https://leetcode.com/problems/multiply-strings/description/

import java.util.*;

class Solution6 {
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

    public String multiply(String num1, int d2) {
        StringBuilder res = new StringBuilder();
        int p1 = num1.length() - 1;
        int carry = 0;

        while (p1 >= 0 || carry > 0) {
            int d1 = (p1 >= 0) ? num1.charAt(p1) - '0' : 0;
            int prod = d1 * d2 + carry;

            res.append(prod % 10);
            carry = prod / 10;
            p1--;
        }

        return res.reverse().toString();
    }

    public String multiply(String num1, String num2) {
        String res = "0";
        int count = 0;

        for (int idx = num2.length() - 1; idx >= 0; idx--) {
            int d2 = num2.charAt(idx) - '0';
            String temp = multiply(num1, d2);
            for (int c = 0; c < count; c++) {
                temp += '0';
            }
            res = addStrings(res, temp);
            count++;
        }
        if (res.charAt(0) == '0')
            return "0";
        return res;
    }
}