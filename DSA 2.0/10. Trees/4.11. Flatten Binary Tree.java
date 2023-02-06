// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/

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
    public static class Pair {
        TreeNode head, tail;

        Pair() {
        }

        Pair(TreeNode head, TreeNode tail) {
            this.head = head;
            this.tail = tail;
        }
    }

    public Pair linearize(TreeNode root) {
        if (root == null)
            return new Pair();

        if (root.left == null && root.right == null)
            return new Pair(root, root); // leaf = head = tail

        if (root.left == null) {
            Pair r = linearize(root.right);
            return new Pair(root, r.tail);
        }

        if (root.right == null) {
            Pair l = linearize(root.left);
            root.left = null;
            root.right = l.head;
            return new Pair(root, l.tail);
        }

        Pair l = linearize(root.left);
        Pair r = linearize(root.right);

        root.left = null;
        root.right = l.head;
        l.tail.right = r.head;
        return new Pair(root, r.tail);
    }

    public void flatten(TreeNode root) {
        linearize(root);
    }
}
