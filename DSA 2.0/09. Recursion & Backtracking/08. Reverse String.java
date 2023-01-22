// https://leetcode.com/problems/reverse-string/description/
// Time = O(N), Space = O(N) Recursion

class Solution {
    public void reverse(char[] s, int left, int right) {
        if (left >= right)
            return;
        reverse(s, left + 1, right - 1);
        // swap left and right
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }

    public void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }
}
