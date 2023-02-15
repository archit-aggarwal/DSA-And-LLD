// https://leetcode.com/problems/count-complete-tree-nodes/description/
// Time = O(log n * log n), Space = O(2 * log n)

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

class Solution {
    public int leftMost(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + leftMost(root.left);
    }

    public int rightMost(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + rightMost(root.right);
    }

    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        int lh = leftMost(root);
        int rh = rightMost(root);

        if (lh == rh)
            return (1 << lh) - 1;
        // perfect binary tree

        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}