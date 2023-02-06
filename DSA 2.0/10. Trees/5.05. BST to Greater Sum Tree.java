// https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/description/

// Time = O(N), Space = O(N)
class Solution {
    int sum = 0;

    // reverse inorder traversal
    public TreeNode bstToGst(TreeNode root) {
        if (root == null)
            return null;
        root.right = bstToGst(root.right);

        sum += root.val;
        root.val = sum;

        root.left = bstToGst(root.left);
        return root;
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