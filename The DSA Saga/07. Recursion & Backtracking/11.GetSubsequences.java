// https://practice.geeksforgeeks.org/problems/power-set4302/1

// time = O(n * 2^n) ; space = O(n)

import java.util.*;

class Solution11 {

    public List<String> getSubsequences(String input, int idx) {
        // base case
        if (idx == input.length()) {
            List<String> result = new ArrayList<>();
            result.add(""); // 2 ^ 0 = 1
            return result;
        }

        // faith or recursive call
        List<String> result = getSubsequences(input, idx + 1);

        // remaining work
        int n = result.size();
        for (int i = 0; i < n; i++) {
            String res = input.charAt(idx) + result.get(i);
            result.add(res);
        }
        return result;
    }

    public List<String> AllPossibleStrings(String s) {
        List<String> result = getSubsequences(s, 0);
        Collections.sort(result); // lexicographically sorted
        result.remove(0); // empty subsequence ignored
        return result;

    }
}