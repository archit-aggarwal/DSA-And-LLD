import java.util.*;
// Time = O(2 ^ N), Space = O(N)

class Solution {
    public void solve(String output, int open, int close, int n, List<String> res) {
        if (output.length() == 2 * n) {
            res.add(output);
            return;
        }

        if (open < n)
            solve(output + "(", open + 1, close, n, res);
        if (close < open)
            solve(output + ")", open, close + 1, n, res);
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        solve("", 0, 0, n, res);
        return res;
    }
}
