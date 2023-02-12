import java.util.*;
// https://leetcode.com/problems/binary-tree-paths/description/
// Time = O(N), Space = O(N)

class Solution {
    List<String> paths = new ArrayList<>();

    public void dfs(TreeNode root, String path) {
        if (root == null)
            return;

        if (root.left == null && root.right == null) {
            path += root.val;
            paths.add(path);
            return;
        }

        dfs(root.left, path + root.val + "->");
        dfs(root.right, path + root.val + "->");
    }

    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root, "");
        return paths;
    }
}

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