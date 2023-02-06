// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/

// Time = O(N), Space = O(N)
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;
        if (root == p || root == q)
            return root;

        TreeNode lans = lowestCommonAncestor(root.left, p, q);
        TreeNode rans = lowestCommonAncestor(root.right, p, q);

        if (lans != null && rans != null)
            return root;
        if (lans != null)
            return lans;
        return rans;
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