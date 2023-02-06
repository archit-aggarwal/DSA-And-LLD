import java.util.*;
// https://leetcode.com/problems/path-sum-ii/

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
    List<List<Integer>> paths = new ArrayList<>();

    public void dfs(TreeNode root, int sum, List<Integer> path) {
        if (root == null)
            return;

        sum = sum - root.val;
        path.add(root.val);

        if (root.left == null && root.right == null && sum == 0) {
            paths.add(new ArrayList<>(path)); // deep copy
        }

        dfs(root.left, sum, path);
        dfs(root.right, sum, path);

        path.remove(path.size() - 1); // backtracking
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum, new ArrayList<>());
        return paths;
    }
}