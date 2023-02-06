// https://leetcode.com/problems/binary-tree-maximum-path-sum/

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// Time = O(N) DFS, Space = O(N) Recursion Call Stack

// Approach 1: Using Global Variable
class Solution {
    int diameter = Integer.MIN_VALUE;

    public int dfs(TreeNode root) {
        if (root == null)
            return 0;

        int lsum = Math.max(0, dfs(root.left));
        int rsum = Math.max(0, dfs(root.right));
        diameter = Math.max(diameter, lsum + rsum + root.val);

        return Math.max(lsum, rsum) + root.val;
    }

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return diameter;
    }
}

// Approach 2: Using Pair
class Solution2 {
    public static class Pair {
        int height = 0, diameter = Integer.MIN_VALUE;
    }

    public Pair dfs(TreeNode root) {
        if (root == null)
            return new Pair();

        Pair l = dfs(root.left);
        Pair r = dfs(root.right);

        l.height = Math.max(0, l.height);
        r.height = Math.max(0, r.height);

        Pair ans = new Pair();
        ans.diameter = Math.max(l.diameter, r.diameter);
        ans.diameter = Math.max(ans.diameter,
                l.height + r.height + root.val);

        ans.height = Math.max(l.height, r.height) + root.val;
        return ans;
    }

    public int maxPathSum(TreeNode root) {
        Pair ans = dfs(root);
        return ans.diameter;
    }
}