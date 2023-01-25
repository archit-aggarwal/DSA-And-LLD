import java.util.*;
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

// Time = O(3 ^ N), Space = O(N)
class Solution {
    String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    List<String> res = new ArrayList<>();

    public void helper(String input, int idx, String output) {
        if (idx == input.length()) {
            res.add(output);
            return;
        }

        int digit = input.charAt(idx) - '0';
        for (char letter : map[digit].toCharArray()) {
            helper(input, idx + 1, output + letter);
        }
    }

    public List<String> letterCombinations(String input) {
        if (input.length() == 0)
            return res;
        helper(input, 0, "");
        return res;
    }
}
