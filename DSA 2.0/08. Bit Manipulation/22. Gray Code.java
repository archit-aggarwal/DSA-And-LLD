import java.util.*;
// https://leetcode.com/problems/gray-code/description/

class Solution {
    public List<Integer> grayCode(int n) {
        if (n == 1) {
            List<Integer> res = new ArrayList<>();
            res.add(0);
            res.add(1);
            return res;
        }

        List<Integer> res = grayCode(--n);

        for (int idx = res.size() - 1; idx >= 0; idx--) {
            int ans = (res.get(idx)) | (1 << n);
            res.add(ans);
        }

        return res;
    }
}
