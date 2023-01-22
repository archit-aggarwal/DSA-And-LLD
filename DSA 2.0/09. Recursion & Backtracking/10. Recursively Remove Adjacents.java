// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/
// Time = O(N), Space = O(N)

class Solution {
    public void remove(String input, int idx, StringBuilder output) {
        if (idx == input.length())
            return;
        char ch = input.charAt(idx);

        if (output.length() > 0 && output.charAt(output.length() - 1) == ch) {
            // adjacent duplicates -> deleted
            output.deleteCharAt(output.length() - 1);
        } else
            output.append(ch);

        remove(input, idx + 1, output);
    }

    public String removeDuplicates(String s) {
        StringBuilder output = new StringBuilder();
        remove(s, 0, output);
        return output.toString();
    }
}