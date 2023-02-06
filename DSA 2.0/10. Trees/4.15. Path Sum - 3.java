// https://leetcode.com/problems/path-sum-iii/

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

// Time = O(N ^ 2), Space = O(N) Recursion Call Stack
class Solution {
    // dfs is assuming path starts from root node only
    public int dfs(TreeNode root, long sum) {
        if (root == null)
            return 0;
        sum = sum - root.val;

        int paths = 0;
        if (sum == 0)
            paths++;

        paths += dfs(root.left, sum)
                + dfs(root.right, sum);

        return paths;
    }

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null)
            return 0;

        return dfs(root, targetSum)
                + pathSum(root.left, targetSum)
                + pathSum(root.right, targetSum);
    }
}
