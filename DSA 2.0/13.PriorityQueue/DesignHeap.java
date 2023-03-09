import java.io.*;
import java.util.*;

//https://www.pepcoding.com/resources/online-java-foundation/hashmap-and-heap/priority-queue-using-heap-official/ojquestion

class Main {
    public static class PriorityQueue {
        ArrayList<Integer> data = new ArrayList<>();

        public PriorityQueue() {
        }

        public PriorityQueue(int[] arr) {
            // for(int val: data) add(val);
            // O(N * log N)

            for (int val : arr)
                data.add(val); // Complete Binary Tree
            for (int idx = data.size() - 1; idx >= 0; idx--)
                downheapify(idx); // Heap Order Property
        }

        public void add(int val) {
            data.add(val);
            upheapify(data.size() - 1);
        }

        void upheapify(int idx) {
            if (idx == 0)
                return;

            int par = (idx - 1) / 2;
            if (data.get(par) < data.get(idx))
                return;

            Collections.swap(data, idx, par);
            upheapify(par);
        }

        public void downheapify(int idx) {
            int l = 2 * idx + 1;
            int r = 2 * idx + 2;
            int min = idx;

            if (l < data.size() && data.get(l) < data.get(min))
                min = l;
            if (r < data.size() && data.get(r) < data.get(min))
                min = r;

            if (min == idx)
                return;
            Collections.swap(data, idx, min);
            downheapify(min);
        }

        public int remove() {
            if (data.size() == 0) {
                System.out.println("Underflow");
                return -1;
            }

            int val = data.get(0);
            Collections.swap(data, 0, data.size() - 1);
            data.remove(data.size() - 1);
            downheapify(0);
            return val;
        }

        public int peek() {
            if (data.size() == 0) {
                System.out.println("Underflow");
                return -1;
            }
            return data.get(0);
        }

        public int size() {
            return data.size();
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue qu = new PriorityQueue();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            }
            str = br.readLine();
        }
    }
}