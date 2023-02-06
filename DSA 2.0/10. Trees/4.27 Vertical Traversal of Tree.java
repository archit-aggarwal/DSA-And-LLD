import java.util.*;
// https://practice.geeksforgeeks.org/problems/print-a-binary-tree-in-vertical-order/1

// Time = O(N), Space = O(N)
class Solution {
    static class Pair {
        Node root;
        int col;

        Pair(Node root, int col) {
            this.root = root;
            this.col = col;
        }
    }

    static ArrayList<Integer> verticalOrder(Node root) {
        if (root == null)
            return new ArrayList<>();

        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(root, 0));

        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        // columns : nodes in the column

        while (q.size() > 0) {
            root = q.peek().root;
            int col = q.remove().col;

            if (map.get(col) == null)
                map.put(col, new ArrayList<>());
            map.get(col).add(root.data);

            if (root.left != null)
                q.add(new Pair(root.left, col - 1));
            if (root.right != null)
                q.add(new Pair(root.right, col + 1));
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (Integer col : map.keySet()) {
            res.addAll(map.get(col));
        }
        return res;
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