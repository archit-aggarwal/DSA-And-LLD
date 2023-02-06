// https://leetcode.com/problems/search-in-a-binary-search-tree/description/

// Time = O(log N), Space = O(log N)
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;
        if (root.val == val)
            return root;
        if (val < root.val)
            return searchBST(root.left, val);
        return searchBST(root.right, val);
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