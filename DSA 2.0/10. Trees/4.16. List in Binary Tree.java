// https://leetcode.com/problems/linked-list-in-binary-tree/

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

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

// Time = O(N ^ 2), Space = O(N) Recursion Call Stack
class Solution {
    // dfs returns true if linked list is starting from root
    public boolean dfs(ListNode head, TreeNode root) {
        if (head == null)
            return true;
        if (root == null)
            return false;

        if (head.val != root.val)
            return false;
        return dfs(head.next, root.left) || dfs(head.next, root.right);
    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null)
            return false;

        return dfs(head, root) || isSubPath(head, root.left)
                || isSubPath(head, root.right);
    }
}
