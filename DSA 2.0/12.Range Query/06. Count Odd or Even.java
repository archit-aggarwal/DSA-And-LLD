import java.util.*;
// https://www.codingninjas.com/codestudio/problems/hard_5841302

class Solution {
    static int[] nodes;

    public static void construct(int idx, int left, int right, int[] nums) {
        if (left > right)
            return;
        if (left == right) {
            nodes[idx] = (nums[left] % 2 == 1) ? 1 : 0;
            return;
        }

        int mid = left + (right - left) / 2;
        construct(2 * idx + 1, left, mid, nums);
        construct(2 * idx + 2, mid + 1, right, nums);
        nodes[idx] = nodes[2 * idx + 1] + nodes[2 * idx + 2];
    }

    public static int countOdd(int idx, int nl, int nr, int gl, int gr) {
        if (nr < gl || gr < nl)
            return 0; // no overlap
        if (nl >= gl && nr <= gr)
            return nodes[idx]; // complete overlap

        int mid = nl + (nr - nl) / 2;
        int left = countOdd(2 * idx + 1, nl, mid, gl, gr);
        int right = countOdd(2 * idx + 2, mid + 1, nr, gl, gr);
        return left + right;
    }

    public static void update(int idx, int left, int right, int index, int value) {
        if (left == right) {
            nodes[idx] = (value % 2 == 1) ? 1 : 0;
            return;
        }

        int mid = left + (right - left) / 2;
        if (index <= mid)
            update(2 * idx + 1, left, mid, index, value);
        else
            update(2 * idx + 2, mid + 1, right, index, value);
        nodes[idx] = nodes[2 * idx + 1] + nodes[2 * idx + 2];
    }

    public static List<Integer> solve(int n, int[] nums, int t, int[][] queries) {
        nodes = new int[4 * n + 5];
        construct(0, 0, n - 1, nums);

        List<Integer> res = new ArrayList<>();
        for (int[] q : queries) {
            if (q[0] == 0)
                update(0, 0, n - 1, q[1], q[2]);
            else if (q[0] == 1) {
                // count even
                int left = q[1], right = q[2];
                int odd = countOdd(0, 0, n - 1, left, right);
                res.add((right - left + 1) - odd);
            } else {
                // count odd
                int left = q[1], right = q[2];
                int odd = countOdd(0, 0, n - 1, left, right);
                res.add(odd);
            }
        }

        return res;
    }

}
