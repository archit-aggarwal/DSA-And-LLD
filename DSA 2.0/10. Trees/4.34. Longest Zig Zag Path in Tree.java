// https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/description/

// Time = O(N), Space = O(N)
class Solution {
    int zigzag = 0;

    public static class Pair {
        int zig = -1, zag = -1;
    }

    public Pair dfs(TreeNode root) {
        if (root == null)
            return new Pair();

        Pair lans = dfs(root.left);
        Pair rans = dfs(root.right);

        Pair ans = new Pair();
        ans.zig = lans.zag + 1;
        ans.zag = rans.zig + 1;

        zigzag = Math.max(zigzag, Math.max(ans.zig, ans.zag));
        return ans;
    }

    public int longestZigZag(TreeNode root) {
        dfs(root);
        return zigzag;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}