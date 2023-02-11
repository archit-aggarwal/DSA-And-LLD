// https://leetcode.com/problems/subtree-of-another-tree/description/
// Time = O(N ^ 2), Space = O(N)

class Solution {
    // fix subtree starting at the root node
    public boolean isSame(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null)
            return true;
        if (root == null || subRoot == null)
            return false;
        if (root.val != subRoot.val)
            return false;

        return isSame(root.left, subRoot.left)
                && isSame(root.right, subRoot.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null)
            return true;
        if (root == null || subRoot == null)
            return false;

        return isSame(root, subRoot) || isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }
}
