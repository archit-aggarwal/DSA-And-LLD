// https://leetcode.com/problems/reverse-words-in-a-string-iii/description/

import java.util.*;

class Solution2 {
    public void reverse(char[] res, int left, int right) {
        while (left <= right) {
            char temp = res[left];
            res[left] = res[right];
            res[right] = temp;
            left++;
            right--;
        }
    }

    public String reverseWords(String str) {
        char[] res = str.toCharArray();

        int left = 0;
        while (left < str.length()) {
            int right = left;

            while (right < str.length() && res[right] != ' ') {
                right++;
            }

            reverse(res, left, right - 1);
            left = right + 1;
        }
        return String.valueOf(res);
    }
}