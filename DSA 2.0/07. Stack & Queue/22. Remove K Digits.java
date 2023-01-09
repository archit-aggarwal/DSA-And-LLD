// https://leetcode.com/problems/remove-k-digits/description/
// Time = O(N), Space = O(1)

class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder res = new StringBuilder();

        char[] chs = num.toCharArray();
        for (char ch : chs) {
            while (k > 0 && res.length() > 0 && res.charAt(res.length() - 1) > ch) {
                res.deleteCharAt(res.length() - 1);
                k--;
            }
            res.append(ch);
        }

        while (k-- > 0) {
            res.deleteCharAt(res.length() - 1);
        }

        int idx = 0;
        while (idx < res.length() && res.charAt(idx) == '0')
            idx++;

        if (idx == res.length())
            return "0";
        return res.toString().substring(idx);
    }
}