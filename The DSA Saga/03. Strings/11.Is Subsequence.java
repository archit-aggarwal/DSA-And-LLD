// https://leetcode.com/problems/is-subsequence/

// Time Complexity: O(N) Space Complexity: O(1)

class Solution {
    public boolean isSubsequence(String s1, String s2) {
        int p1 = 0, p2 = 0;

        while(p1 < s1.length() && p2 < s2.length()){
            if(s1.charAt(p1) == s2.charAt(p2)){
                p1++; p2++;
            } else {
                p2++;
            }
        }
        return (p1 == s1.length());
    }
}