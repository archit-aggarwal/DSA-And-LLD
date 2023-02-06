// https://leetcode.com/problems/minimum-depth-of-binary-tree/

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
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;

        if (root.right == null)
            return 1 + minDepth(root.left);
        if (root.left == null)
            return 1 + minDepth(root.right);

        int lh = minDepth(root.left);
        int rh = minDepth(root.right);
        return Math.min(lh, rh) + 1;
    }
}

class Solution2 {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        int lh = minDepth(root.left);
        int rh = minDepth(root.right);
        if (lh == 0)
            return rh + 1;
        if (rh == 0)
            return lh + 1;
        return Math.min(lh, rh) + 1;
    }
}
