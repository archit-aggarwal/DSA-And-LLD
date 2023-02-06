// https://leetcode.com/problems/recover-binary-search-tree/description/

// Time = O(N), Space = O(N)
class Solution {
    TreeNode p, q;
    TreeNode prev = null;

    public void dfs(TreeNode root) {
        if (root == null)
            return;
        dfs(root.left);
        if (prev != null && prev.val >= root.val) {
            if (p == null)
                p = prev;
            q = root;
        }
        prev = root;
        dfs(root.right);
    }

    public void recoverTree(TreeNode root) {
        dfs(root);
        int temp = p.val;
        p.val = q.val;
        q.val = temp;
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