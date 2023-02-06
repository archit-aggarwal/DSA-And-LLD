import java.util.*;
// https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1

// Time = O(N), Space = O(N)
class Solution {
    static class Pair {
        int data, row;

        Pair(int data, int row) {
            this.data = data;
            this.row = row;
        }
    }

    static TreeMap<Integer, Pair> map;

    static void dfs(Node root, int row, int col) {
        if (root == null)
            return;

        if (map.get(col) == null || row < map.get(col).row)
            map.put(col, new Pair(root.data, row));

        dfs(root.left, row + 1, col - 1);
        dfs(root.right, row + 1, col + 1);
    }

    static ArrayList<Integer> topView(Node root) {
        map = new TreeMap<>();
        dfs(root, 0, 0);

        ArrayList<Integer> res = new ArrayList<>();
        for (Integer col : map.keySet())
            res.add(map.get(col).data);
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