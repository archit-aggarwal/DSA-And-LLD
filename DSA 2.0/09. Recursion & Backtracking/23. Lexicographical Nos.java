import java.util.*;
// https://leetcode.com/problems/lexicographical-numbers/description/
// Time = O(N), Space = O(log10 N)

class Solution {
    List<Integer> res = new ArrayList<>();

    public void solve(int curr, int n) {
        if (curr > n)
            return;
        if (curr <= n && curr > 0)
            res.add(curr);

        for (int ch = 0; ch <= 9; ch++) {
            if (ch == 0 && curr == 0)
                continue;
            solve(curr * 10 + ch, n);
        }
    }

    public List<Integer> lexicalOrder(int n) {
        solve(0, n);
        return res;
    }
}
