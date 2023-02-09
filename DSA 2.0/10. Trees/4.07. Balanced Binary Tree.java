// https://leetcode.com/problems/balanced-binary-tree/description/

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
    boolean isBalanced = true;

    public int height(TreeNode root) {
        if (root == null)
            return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        if (Math.abs(lh - rh) > 1)
            isBalanced = false;
        return Math.max(lh, rh) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        height(root);
        return isBalanced;
    }
}

// Approach 2: Using Pair
class Solution2 {
    static class Pair {
        int height = 0;
        boolean isBalanced = true;
    }

    public Pair dfs(TreeNode root) {
        if (root == null)
            return new Pair();

        Pair l = dfs(root.left);
        Pair r = dfs(root.right);

        Pair ans = new Pair();
        ans.height = Math.max(l.height, r.height) + 1;
        ans.isBalanced = l.isBalanced && r.isBalanced
                && Math.abs(l.height - r.height) <= 1;
        return ans;
    }

    public boolean isBalanced(TreeNode root) {
        Pair ans = dfs(root);
        return ans.isBalanced;
    }
}

// Brute Force
// Time = O(N ^ 2), Space = O(N)
class Solution3 {
    public int height(TreeNode root) {
        if (root == null)
            return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;

        int lh = height(root.left);
        int rh = height(root.right);

        if (Math.abs(lh - rh) > 1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}

// Approach 4: Passing Parameter as Array
class Solution4 {
    public int dfs(TreeNode root, boolean[] balanced) {
        if (root == null)
            return 0;
        int lh = dfs(root.left, balanced);
        int rh = dfs(root.right, balanced);

        if (Math.abs(lh - rh) > 1)
            balanced[0] = false;
        return Math.max(lh, rh) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        boolean[] balanced = { true };
        dfs(root, balanced);
        return balanced[0];
    }
}
