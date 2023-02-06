import java.util.*;
// https://leetcode.com/problems/maximum-depth-of-n-ary-tree/description/

// Time = O(N), Space = O(N)
class Solution {
    public int maxDepth(Node root) {
        if (root == null)
            return 0;
        int height = 0;
        for (Node child : root.children) {
            height = Math.max(height, maxDepth(child));
        }
        return 1 + height;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};