// https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/

// Time = O(N), Space = O(N)
class Solution {
    int prev = (int) -1e9, diff = (int) 1e9;

    public void dfs(TreeNode root) {
        if (root == null)
            return;
        dfs(root.left);
        diff = Math.min(diff, root.val - prev);
        prev = root.val;
        dfs(root.right);
    }

    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return diff;
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