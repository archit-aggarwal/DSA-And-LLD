import java.util.*;
// https://leetcode.com/problems/n-ary-tree-preorder-traversal/description/

// Time = O(N), Space = O(N)
class Solution {
    List<Integer> res = new ArrayList<>();

    public void dfs(Node root) {
        res.add(root.val);
        for (Node child : root.children)
            dfs(child);
    }

    public List<Integer> preorder(Node root) {
        if (root == null)
            return res;
        dfs(root);
        return res;
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