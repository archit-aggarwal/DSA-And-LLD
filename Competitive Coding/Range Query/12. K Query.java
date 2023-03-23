import java.util.*;
import java.io.*;

class Solution {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

    static FastReader scn = new FastReader();
    static FastWriter out = new FastWriter();

    static {
        if (System.getProperty("ONLINE_JUDGE") != null) {
            try {
                System.setOut(new PrintStream(
                        new FileOutputStream("output.txt")));
                System.setIn(new FileInputStream("input.txt"));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        try {
            solve();
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    static class Node {
        int low, high;
        Node left, right;
        ArrayList<Integer> arr = new ArrayList<>();

        Node(int low, int high) {
            this.low = low;
            this.high = high;
        }
    }

    static class Tree {
        static Node build(int low, int high, int[] nums) {
            if (low > high)
                return new Node(low, high);
            if (low == high) {
                Node root = new Node(low, high);
                root.arr.add(nums[low]);
                return root;
            }

            Node root = new Node(low, high);
            int mid = low + (high - low) / 2;

            root.left = build(low, mid, nums);
            root.right = build(mid + 1, high, nums);
            root.arr = merge(root.left.arr, root.right.arr);
            return root;
        }

        static int query(Node root, int low, int high, int k) {
            if (high < root.low || root.high < low)
                return 0; // non overlap

            if (root.low >= low && root.high <= high)
                return root.arr.size() - upperBound(root.arr, k); // completely inside

            return query(root.left, low, high, k) + query(root.right, low, high, k); // partial overlap

        }

        static ArrayList<Integer> merge(ArrayList<Integer> a1, ArrayList<Integer> a2) {
            ArrayList<Integer> res = new ArrayList<>();

            int i1 = 0, i2 = 0;
            while (i1 < a1.size() && i2 < a2.size()) {
                if (a1.get(i1) <= a2.get(i2))
                    res.add(a1.get(i1++));
                else
                    res.add(a2.get(i2++));
            }

            while (i1 < a1.size())
                res.add(a1.get(i1++));
            while (i2 < a2.size())
                res.add(a2.get(i2++));
            return res;
        }

        static int upperBound(ArrayList<Integer> nums, int target) {
            // Same as Ceil Value
            int left = 0, right = nums.size() - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums.get(mid) > target)
                    right = mid - 1;
                else
                    left = mid + 1;
            }

            return left;
        }
    }

    public static void solve() throws Exception {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        Node root = Tree.build(0, n - 1, arr);

        int q = scn.nextInt();
        while (q-- > 0) {
            int left = scn.nextInt();
            int right = scn.nextInt();
            int k = scn.nextInt();
            out.println(Tree.query(root, left - 1, right - 1, k));
        }
    }
}
