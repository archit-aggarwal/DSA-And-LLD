// https://leetcode.com/problems/validate-binary-search-tree/description/

// Time = O(N), Space = O(N)
class Solution {
    public boolean dfs(TreeNode root, long low, long high) {
        if (root == null)
            return true;
        if (root.val <= low || root.val >= high)
            return false;
        return dfs(root.left, low, root.val) && dfs(root.right, root.val, high);
    }

    public boolean isValidBST(TreeNode root) {
        return dfs(root, Long.MIN_VALUE, Long.MAX_VALUE);
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