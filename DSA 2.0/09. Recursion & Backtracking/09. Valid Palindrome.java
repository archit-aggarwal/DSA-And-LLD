// https://leetcode.com/problems/valid-palindrome/description/
// Time = O(N), Space = O(N)

class Solution {
    public boolean isPalindrome(String s, int left, int right) {
        if (left >= right)
            return true;
        char l = s.charAt(left);
        char r = s.charAt(right);

        if (Character.isLetterOrDigit(l) == false)
            return isPalindrome(s, left + 1, right);

        if (Character.isLetterOrDigit(r) == false)
            return isPalindrome(s, left, right - 1);

        if (l != r)
            return false;
        return isPalindrome(s, left + 1, right - 1);
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        return isPalindrome(s, 0, s.length() - 1);
    }
}