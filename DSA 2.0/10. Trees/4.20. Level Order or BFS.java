import java.util.*;
// https://practice.geeksforgeeks.org/problems/level-order-traversal/1

// Time = O(N), Space = O(N)
class Solution {
    static ArrayList<Integer> levelOrder(Node root) {
        ArrayList<Integer> bfs = new ArrayList<>();
        if (root == null)
            return bfs;

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while (q.size() > 0) {
            root = q.remove();
            bfs.add(root.data);

            if (root.left != null)
                q.add(root.left);
            if (root.right != null)
                q.add(root.right);
        }

        return bfs;
    }
}

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}