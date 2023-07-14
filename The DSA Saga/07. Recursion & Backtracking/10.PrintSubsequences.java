// https://practice.geeksforgeeks.org/problems/power-set4302/1

// time = O(2^n) i.e exponential ; space = O(n)

import java.util.*;

class Solution10 {
    // APPROACH: 1

    List<String> result;

    public void printSubsequences(String input, int idx, String output) {
        // base case
        if (idx == input.length()) {
            if (output.length() == 0)
                return; // empty subsequence
            result.add(output);
            return;
        }

        // yes recursive call
        printSubsequences(input, idx + 1, output + input.charAt(idx));

        // no recursive call
        printSubsequences(input, idx + 1, output);
    }

    public List<String> AllPossibleStrings(String s) {
        result = new ArrayList<>();
        printSubsequences(s, 0, "");
        Collections.sort(result);
        return result;

    }

    // APPROACH: 2

    public void printSubsequences(String input, int idx, String output, List<String> result) {
        // base case
        if (idx == input.length()) {
            if (output.length() == 0)
                return; // empty subsequence
            result.add(output);
            return;
        }

        // yes recursive call
        printSubsequences(input, idx + 1, output + input.charAt(idx), result);

        // no recursive call
        printSubsequences(input, idx + 1, output, result);
    }

    public List<String> AllPossibleStrings(String s) {
        List<String> result = new ArrayList<>();
        printSubsequences(s, 0, "", result);
        Collections.sort(result);
        return result;

    }
}