// https://leetcode.com/problems/binary-tree-tilt/

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

// Approach 1: Using Global Variable
class Solution1 {
    int tilt = 0;

    public int dfs(TreeNode root) {
        if (root == null)
            return 0;
        int leftSum = dfs(root.left);
        int rightSum = dfs(root.right);

        tilt = tilt + Math.abs(leftSum - rightSum);
        return leftSum + rightSum + root.val;
    }

    public int findTilt(TreeNode root) {
        dfs(root);
        return tilt;
    }
}

// Approach 2: Using Pair
class Solution2 {
    public static class Pair {
        int sum, tilt;
    }

    public Pair dfs(TreeNode root) {
        if (root == null)
            return new Pair();
        Pair left = dfs(root.left);
        Pair right = dfs(root.right);

        Pair ans = new Pair();
        ans.tilt = Math.abs(left.sum - right.sum)
                + left.tilt + right.tilt;
        ans.sum = left.sum + right.sum + root.val;
        return ans;
    }

    public int findTilt(TreeNode root) {
        Pair ans = dfs(root);
        return ans.tilt;
    }
}