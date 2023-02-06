// https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/

// Time = O(N), Space = O(N)
class Solution {
    int k, ans;

    public void dfs(TreeNode root) {
        if (root == null)
            return;
        dfs(root.left);
        k--;
        if (k == 0)
            ans = root.val;
        dfs(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        this.ans = -1;
        dfs(root);
        return ans;
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