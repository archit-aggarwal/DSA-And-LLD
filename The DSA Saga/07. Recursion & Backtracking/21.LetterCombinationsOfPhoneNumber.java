// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

// time = O(4^n) ; space = O(n);

import java.util.*;

class Solution21 {
    String[] map = { "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz" };

    List<String> ways;

    public void printPaths(String input, int idx, String output) {
        if (idx == input.length()) {
            ways.add(output);
            return;
        }

        int digit = input.charAt(idx) - '0';

        for (char letter : map[digit].toCharArray())
            printPaths(input, idx + 1, output + letter);
    }

    public List<String> letterCombinations(String digits) {
        ways = new ArrayList<>();
        if (digits.length() == 0)
            return ways;

        printPaths(digits, 0, "");
        return ways;
    }
}