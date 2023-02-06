import java.util.*;
// https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1

// Time = O(N), Space = O(N)
class Tree {
    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null)
            return res;

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while (q.size() > 0) {
            res.add(q.peek().data); // leftmost node in every node
            for (int c = q.size(); c > 0; c--) {
                root = q.remove();
                if (root.left != null)
                    q.add(root.left);
                if (root.right != null)
                    q.add(root.right);
            }
        }

        return res;
    }
}

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}