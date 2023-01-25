import java.util.*;

// https://www.codingninjas.com/codestudio/problems/generalized-abbreviation_1233144?leftPanelTab=0

// leetcode locked
// Time = O(2 ^ N), Space = O(N)
class Solution {
    static ArrayList<String> res;

    static void helper(String input, int idx, String output, int skip) {
        if (idx == input.length()) {
            if (skip > 0)
                res.add(output + skip);
            else
                res.add(output);
            return;
        }

        char ch = input.charAt(idx);

        // yes (letter)
        if (skip > 0) {
            helper(input, idx + 1, output + skip + ch, 0);
        } else {
            helper(input, idx + 1, output + ch, 0);
        }

        // no (digit)
        helper(input, idx + 1, output, skip + 1);
    }

    public static ArrayList<String> findAbbr(String str) {
        res = new ArrayList<>();
        helper(str, 0, "", 0);
        Collections.sort(res);
        return res;
    }
}