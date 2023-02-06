// https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/

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
    public int height(TreeNode root) {
        if (root == null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    int time = 0;

    public int dfs(TreeNode root, int start) {
        if (root == null)
            return 0;

        if (root.val == start) {
            time = height(root) - 1;
            return 1;
        }

        int left = dfs(root.left, start);
        int right = dfs(root.right, start);

        if (left > 0) {
            time = Math.max(time, height(root.right) + left);
            return 1 + left;
        } else if (right > 0) {
            time = Math.max(time, height(root.left) + right);
            return 1 + right;
        } else
            return 0;
    }

    public int amountOfTime(TreeNode root, int start) {
        dfs(root, start);
        return time;
    }
}

// Approach 2: Using Pair
class Solution2 {
    public int height(TreeNode root) {
        if (root == null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static class Pair {
        int dist, time;
    }

    public Pair dfs(TreeNode root, int start) {
        if (root == null)
            return new Pair();

        if (root.val == start) {
            Pair ans = new Pair();
            ans.time = height(root) - 1;
            ans.dist = 1;
            return ans;
        }

        Pair left = dfs(root.left, start);
        Pair right = dfs(root.right, start);

        Pair ans = new Pair();
        ans.time = Math.max(ans.time,
                Math.max(left.time, right.time));

        if (left.dist > 0) {
            ans.dist = left.dist + 1;
            ans.time = Math.max(ans.time,
                    height(root.right) + left.dist);
        } else if (right.dist > 0) {
            ans.dist = right.dist + 1;
            ans.time = Math.max(ans.time,
                    height(root.left) + right.dist);
        }
        return ans;
    }

    public int amountOfTime(TreeNode root, int start) {
        Pair ans = dfs(root, start);
        return ans.time;
    }
}