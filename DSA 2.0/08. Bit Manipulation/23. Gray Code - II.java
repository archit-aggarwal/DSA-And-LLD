import java.util.*;
// https://practice.geeksforgeeks.org/problems/generate-grey-code-sequences/1

class Solution {
    ArrayList<String> generateCode(int n) {
        if (n == 1) {
            ArrayList<String> res = new ArrayList<>();
            res.add("0");
            res.add("1");
            return res;
        }

        ArrayList<String> res = generateCode(--n);
        for (int idx = res.size() - 1; idx >= 0; idx--) {
            res.add("1" + res.get(idx));
            res.set(idx, "0" + res.get(idx));
        }

        return res;
    }
}