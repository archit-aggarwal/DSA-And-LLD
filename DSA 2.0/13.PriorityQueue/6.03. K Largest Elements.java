import java.util.*;
// https://practice.geeksforgeeks.org/problems/k-largest-elements3736/1

class Solution {
    // Time = O(n logn), Space = O(1) constant extra space
    public static ArrayList<Integer> approach1(int[] arr, int n, int k) {
        Arrays.sort(arr);
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = n - 1; i >= n - k; i--) {
            res.add(arr[i]);
        }
        return res;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void downheapify(int[] arr, int n, int idx) {
        int li = 2 * idx + 1;
        int ri = 2 * idx + 2;

        int max = idx;
        if (li < n && arr[li] > arr[max])
            max = li;
        if (ri < n && arr[ri] > arr[max])
            max = ri;

        if (max == idx)
            return;
        swap(arr, idx, max);
        downheapify(arr, n, max);
    }

    // Time = O(n + k log n), Space = O(1) constant extra space
    public static ArrayList<Integer> approach2(int[] arr, int n, int k) {
        for (int i = n - 1; i >= 0; i--)
            downheapify(arr, n, i);

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = n - 1; i >= n - k; i--) {
            res.add(arr[0]);
            swap(arr, 0, i);
            downheapify(arr, i, 0);
        }

        return res;
    }

    // Time = O(n log k), Space = O(k) extra space
    public static ArrayList<Integer> approach3(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int val : arr) {
            if (pq.size() < k)
                pq.add(val);
            else if (val > pq.peek()) {
                pq.remove();
                pq.add(val);
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        while (pq.size() > 0)
            res.add(pq.remove());
        Collections.reverse(res);
        return res;
    }

    public static ArrayList<Integer> kLargest(int arr[], int n, int k) {
        return approach3(arr, n, k);
    }
}