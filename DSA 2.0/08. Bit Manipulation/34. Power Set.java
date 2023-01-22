import java.util.*;

// https://practice.geeksforgeeks.org/problems/power-set4302/1
// Time = O(2^N * N), Space = O(1) No Extra Space

class Solution {
    public List<String> AllPossibleStrings(String s) {
        List<String> res = new ArrayList<>();
        int n = s.length();

        for (int decimal = 1; decimal < (1 << n); decimal++) {
            String subset = "";
            for (int bit = 0; bit < n; bit++) {
                if ((decimal & (1 << bit)) != 0)
                    subset += s.charAt(bit);
            }
            res.add(subset);
        }

        Collections.sort(res);
        return res;
    }

}