//Link : https://leetcode.com/problems/reverse-string/
//Time Complexity : O(N)
//Extra Space : O(1)

class Solution {
    public void reverseString(char[] s) {
        int lo = 0;
        int hi = s.length - 1;

        while (lo < hi) {
            char temp = s[lo];
            s[lo] = s[hi];
            s[hi] = temp;
            lo++;
            hi--;
        }
    }
}
