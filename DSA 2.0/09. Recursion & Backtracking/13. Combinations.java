import java.util.*;
// https://leetcode.com/problems/combinations/description/

// Approach 1: Using Items having choice (yes or no)
// O(2 ^ N) Time, O(N) Space

class Solution1 {
    List<List<Integer>> res = new ArrayList<>();

    public void combine(int n, int k, List<Integer> output) {
        if (k == 0) {
            res.add(new ArrayList<>(output)); // deep copy
            return;
        }
        if (n == 0)
            return;

        // yes choice
        output.add(n);
        combine(n - 1, k - 1, output);
        output.remove(output.size() - 1); // backtracking

        // no choice
        combine(n - 1, k, output);
    }

    public List<List<Integer>> combine(int n, int k) {
        combine(n, k, new ArrayList<>());
        return res;
    }
}

// Approach 2: Which Item to Select
// Time = O(N!), Space = O(K)

class Solution2 {
    List<List<Integer>> res = new ArrayList<>();

    public void combine(int n, int k, List<Integer> output) {
        if (k == 0) {
            res.add(new ArrayList<>(output)); // deep copy
            return;
        }
        if (n == 0)
            return;

        for (int item = n; item >= 1; item--) {
            output.add(item);
            combine(item - 1, k - 1, output);
            output.remove(output.size() - 1);
        }
    }

    public List<List<Integer>> combine(int n, int k) {
        combine(n, k, new ArrayList<>());
        return res;
    }
}