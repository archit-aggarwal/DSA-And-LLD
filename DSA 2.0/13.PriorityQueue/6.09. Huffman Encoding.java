import java.util.*;
// https://practice.geeksforgeeks.org/problems/huffman-encoding3345/1
// Time = O(N * Log N), Space = O(N) Priority Queue

class Solution {
    public static class Node {
        char data;
        int freq;
        Node left, right;

        Node(char data, int freq) {
            this.data = data;
            this.freq = freq;
        }
    }

    public void dfs(Node root, String path, ArrayList<String> paths) {
        if (root == null)
            return;
        if (root.data != '#')
            paths.add(path);
        dfs(root.left, path + "0", paths);
        dfs(root.right, path + "1", paths);
    }

    public ArrayList<String> huffmanCodes(String S, int f[], int N) {
        PriorityQueue<Node> pq = new PriorityQueue<>((p, q) -> (p.freq >= q.freq) ? 1 : -1);
        // Minimum Heap -> Frequency

        for (int i = 0; i < N; i++)
            pq.add(new Node(S.charAt(i), f[i]));

        while (pq.size() > 1) {
            Node root = new Node('#', 0);

            root.left = pq.remove();
            root.right = pq.remove();

            root.freq = root.left.freq + root.right.freq;
            pq.add(root);
        }

        Node root = pq.remove();
        ArrayList<String> ans = new ArrayList<>();
        dfs(root, "", ans);
        return ans;
    }
}