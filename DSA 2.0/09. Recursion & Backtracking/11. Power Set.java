import java.util.*;
// https://practice.geeksforgeeks.org/problems/power-set4302/1
// Time = O(2 ^ N), Space = O(N) Recursion

class Solution {
    List<String> subsets = new ArrayList<>();

    public void powerset(String input, int idx, String output) {
        if (idx == input.length()) {
            if (output.length() > 0)
                subsets.add(output);
            return;
        }

        // no choice
        powerset(input, idx + 1, output);

        // yes choice
        powerset(input, idx + 1, output + input.charAt(idx));
    }

    public List<String> AllPossibleStrings(String s) {
        powerset(s, 0, "");
        Collections.sort(subsets); // Lexicographically Sorted
        return subsets;
    }
}