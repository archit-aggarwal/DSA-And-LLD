import java.util.*;
// https://leetcode.com/problems/binary-tree-postorder-traversal/description/

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
    List<Integer> postorder = new ArrayList<>();

    void dfs(TreeNode root) {
        if (root == null)
            return;
        dfs(root.left);
        dfs(root.right);
        postorder.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        dfs(root);
        return postorder;
    }
}
