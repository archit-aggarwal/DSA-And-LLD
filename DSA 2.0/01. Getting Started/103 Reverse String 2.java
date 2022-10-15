//Link : https://leetcode.com/problems/reverse-string-ii/
//TC : O(n)
//Extra Space : O(N)

class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i += 2 * k) {
            int lo = i;
            int hi = (int) Math.min(i + k, s.length()) - 1;

            while (lo < hi) {
                char temp = sb.charAt(lo);
                sb.setCharAt(lo, sb.charAt(hi));
                sb.setCharAt(hi, temp);
                lo++;
                hi--;
            }
        }

        return sb.toString();
    }
}
