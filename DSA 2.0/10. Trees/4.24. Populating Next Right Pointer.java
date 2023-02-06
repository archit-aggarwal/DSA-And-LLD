import java.util.*;

// Link 1: https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
// Link 2: https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}

// Approach 1: BFS Extra Space
// Time = O(N), Space = O(N)

class Solution1 {
    public Node connect(Node root) {
        if (root == null)
            return null;

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while (q.size() > 0) {
            Node prev = null;
            for (int c = q.size(); c > 0; c--) {
                Node curr = q.remove();

                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);

                if (prev != null)
                    prev.next = curr;
                prev = curr;
            }
        }

        return root;
    }
}

// Approach 2: BFS without Extra Space
// Time = O(N), Space = O(1)

class Solution2 {
    public Node connect(Node root) {
        Node curr = root;

        while (curr != null) {
            Node dummy = new Node(-1);
            Node tail = dummy;

            while (curr != null) {
                if (curr.left != null) {
                    tail.next = curr.left;
                    tail = tail.next;
                }
                if (curr.right != null) {
                    tail.next = curr.right;
                    tail = tail.next;
                }
                curr = curr.next;
            }
            curr = dummy.next;
        }

        return root;
    }
}