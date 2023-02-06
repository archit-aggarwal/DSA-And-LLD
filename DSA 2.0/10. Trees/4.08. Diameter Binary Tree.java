// https://leetcode.com/problems/diameter-of-binary-tree/description/

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
class Solution1 {
    int diameter = 0;

    public int height(TreeNode root) {
        if (root == null)
            return -1; // edges

        int lh = height(root.left);
        int rh = height(root.right);

        diameter = Math.max(diameter, lh + rh + 2);
        return Math.max(lh, rh) + 1;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }
}

// Approach 2: Using Pair
class Solution2 {
    static class Pair {
        int height = -1;
        int diameter = 0;
    }

    public Pair dfs(TreeNode root) {
        if (root == null)
            return new Pair();

        Pair l = dfs(root.left);
        Pair r = dfs(root.right);

        Pair ans = new Pair();
        ans.height = Math.max(l.height, r.height) + 1;
        ans.diameter = Math.max(l.diameter, r.diameter);
        ans.diameter = Math.max(ans.diameter, l.height + r.height + 2);
        return ans;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        Pair ans = dfs(root);
        return ans.diameter;
    }
}
