import java.util.*;
// https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/

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
    List<Integer> res = new ArrayList<>();

    public void dfs(TreeNode root, int k) {
        if (k < 0 || root == null)
            return;
        if (k == 0)
            res.add(root.val);
        dfs(root.left, k - 1);
        dfs(root.right, k - 1);
    }

    public int search(TreeNode root, TreeNode target, int k) {
        if (root == null)
            return 0;
        if (root == target) {
            dfs(root, k);
            return 1;
        }

        int left = search(root.left, target, k);
        int right = search(root.right, target, k);

        if (left > 0) {
            if (left == k)
                res.add(root.val);
            dfs(root.right, k - left - 1);
            return 1 + left;
        } else if (right > 0) {
            if (right == k)
                res.add(root.val);
            dfs(root.left, k - right - 1);
            return 1 + right;
        } else
            return 0;
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        search(root, target, k);
        return res;
    }
}
