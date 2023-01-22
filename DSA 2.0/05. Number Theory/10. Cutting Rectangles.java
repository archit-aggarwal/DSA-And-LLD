import java.util.*;
// https://practice.geeksforgeeks.org/problems/cutting-rectangles3659/1

class Solution {
    static Long GCD(Long A, Long B) {
        if (B == 0)
            return A;
        return GCD(B, A % B);
    }

    static List<Long> minimumSquares(long L, long B) {
        List<Long> res = new ArrayList<>();

        Long side = GCD(L, B);
        Long count = (L * B) / (side * side);

        res.add(count);
        res.add(side);
        return res;
    }
}