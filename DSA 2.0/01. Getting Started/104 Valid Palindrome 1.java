//Link  https://leetcode.com/problems/valid-palindrome/
//TC O(N)
//Extra Space : O(N)

class Solution {

    public boolean isLowerCase(char ch) {
        if (ch >= 'a' && ch <= 'z')
            return true;
        return false;
    }

    public boolean isUpperCase(char ch) {
        if (ch >= 'A' && ch <= 'Z')
            return true;
        return false;
    }

    public boolean isDigit(char ch) {
        if (ch >= '0' && ch <= '9')
            return true;
        return false;
    }

    public String convert(String str) {

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isLowerCase(ch) || isUpperCase(ch) || isDigit(ch)) {
                if (isUpperCase(ch)) {
                    ch = (char) (ch + 32);
                }
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public boolean isPalindrome(String s) {
        String str = convert(s);

        int lo = 0;
        int hi = str.length() - 1;

        while (lo < hi) {
            if (str.charAt(lo) != str.charAt(hi))
                return false;
            lo++;
            hi--;
        }

        return true;
    }
}
