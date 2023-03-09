import java.io.*;
import java.util.*;

public class Main {

    public static class PriorityQueue<T> {
        ArrayList<T> data = new ArrayList<>();

        public PriorityQueue() {
        }

        public PriorityQueue(T[] arr) {
            // for(int val: data) add(val);
            // O(N * log N)

            for (T val : arr)
                data.add(val); // Complete Binary Tree
            for (int idx = data.size() - 1; idx >= 0; idx--)
                downheapify(idx); // Heap Order Property
        }

        public void add(T val) {
            data.add(val);
            upheapify(data.size() - 1);
        }

        void upheapify(int idx) {
            if (idx == 0)
                return;

            int par = (idx - 1) / 2;
            Comparable p1 = (Comparable) (data.get(idx));
            Comparable p2 = (Comparable) (data.get(par));

            if (p2.compareTo(p1) < 0)
                return;

            Collections.swap(data, idx, par);
            upheapify(par);
        }

        public void downheapify(int idx) {
            int l = 2 * idx + 1;
            int r = 2 * idx + 2;
            int min = idx;

            if (l < data.size()) {
                Comparable p1 = (Comparable) (data.get(l));
                Comparable p2 = (Comparable) (data.get(min));
                if (p1.compareTo(p2) < 0)
                    min = l;
            }

            if (r < data.size()) {
                Comparable p1 = (Comparable) (data.get(r));
                Comparable p2 = (Comparable) (data.get(min));
                if (p1.compareTo(p2) < 0)
                    min = r;
            }

            if (min == idx)
                return;
            Collections.swap(data, idx, min);
            downheapify(min);
        }

        public T remove() {
            if (data.size() == 0) {
                System.out.println("Underflow");
                return null;
            }

            T val = data.get(0);
            Collections.swap(data, 0, data.size() - 1);
            data.remove(data.size() - 1);
            downheapify(0);
            return val;
        }

        public T peek() {
            if (data.size() == 0) {
                System.out.println("Underflow");
                return null;
            }
            return data.get(0);
        }

        public int size() {
            return data.size();
        }
    }

    public static void main(String[] args) throws Exception {
        Integer[] arr = { 50, 60, 20, 70, 40, 10 };
        PriorityQueue<Integer> pq = new PriorityQueue(arr);

        while (pq.size() > 0)
            System.out.print(pq.remove() + " ");

        String[] arr2 = { "Rohit", "Virat", "Surya", "Dhoni", "Rishabh" };
        PriorityQueue<String> pq2 = new PriorityQueue(arr2);

        while (pq2.size() > 0)
            System.out.print(pq2.remove() + " ");

    }
}
