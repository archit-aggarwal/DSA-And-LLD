// Leetcode 1492: https://leetcode.com/problems/the-kth-factor-of-n/description/

import java.util.*;

// Time = O(Root N), Space = O(Factors) = O(Root N)
class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> res = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int f = 1; f * f <= n; f++) {
            if (n % f == 0) {
                res.add(f);
                if (f != n / f)
                    right.add(n / f);
            }
        }

        Collections.reverse(right);
        res.addAll(right);

        if (k > res.size())
            return -1;
        return res.get(k - 1);
    }
}
