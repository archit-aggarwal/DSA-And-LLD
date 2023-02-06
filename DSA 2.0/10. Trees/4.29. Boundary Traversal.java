import java.util.*;
// https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1

// Time = O(N), Space = O(N)
class Solution {
    ArrayList<Integer> ans = new ArrayList<>();

    public void leftBoundary(Node root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            return;

        ans.add(root.data); // preorder: top to bottom
        if (root.left != null)
            leftBoundary(root.left);
        else if (root.right != null)
            leftBoundary(root.right);
    }

    public void rightBoundary(Node root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            return;

        if (root.right != null)
            rightBoundary(root.right);
        else if (root.left != null)
            rightBoundary(root.left);
        ans.add(root.data); // postorder: bottom to top (reverse)
    }

    public void leaves(Node root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            ans.add(root.data);
            return;
        }
        leaves(root.left);
        leaves(root.right);
    }

    ArrayList<Integer> boundary(Node root) {
        if (root == null)
            return new ArrayList<>();
        ans.add(root.data);
        if (root.left == null && root.right == null)
            return ans;

        leftBoundary(root.left);
        leaves(root);
        rightBoundary(root.right);
        return ans;
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}