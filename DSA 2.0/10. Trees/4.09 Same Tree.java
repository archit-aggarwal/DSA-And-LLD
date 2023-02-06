// https://leetcode.com/problems/same-tree/description/

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
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // empty trees are equal
        if (p == null && q == null)
            return true;

        // structurally not same
        if (p == null || q == null)
            return false;

        // node values are not same
        if (p.val != q.val)
            return false;

        return isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }
}
