// https://leetcode.com/problems/reverse-words-in-a-string/

import java.util.*;

class Solution1 {
    // APPROACH: 1 ; 1ST WAY
    public String reverseWords(String str) {
        String[] words = str.trim().split("\s+");
        // trim: leading & trailing spaces: discard
        // split on multiple spaces: single split

        StringBuilder res = new StringBuilder();
        for (int idx = words.length - 1; idx >= 0; idx--) {
            if (idx < words.length - 1) {
                res.append(" ");
            }
            res.append(words[idx]);
        }
        return res.toString();
    }

    // APPROACH: 1 ; 2ND WAY
    public String reverseWords(String str) {
        String[] words = str.split("\s+");

        StringBuilder res = new StringBuilder();
        for (int idx = words.length - 1; idx >= 0; idx--) {
            res.append(" " + words[idx]);

        }
        return res.toString().trim();
    }

    // APPROACH: 2 ; TWO POINTER TECHNIQUE

    public String reverseWords(String str) {
        int right = str.length() - 1;
        StringBuilder res = new StringBuilder();

        // iterate on all words
        while (right >= 0) {

            // right will stop at ending index of a word
            while (right >= 0 && str.charAt(right) == ' ') {
                right--;
            }

            int left = right;
            // left will stop at starting index of a word - 1
            while (left >= 0 && str.charAt(left) != ' ') {
                left--;
            }

            if (res.length() > 0 && left < right) {
                res.append(" ");
            }

            for (int idx = left + 1; idx <= right; idx++) {
                res.append(str.charAt(idx));
            }

            right = left;
        }

        return res.toString();
    }
}