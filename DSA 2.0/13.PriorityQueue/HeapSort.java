import java.util.*;
// Time = O(N * Log N) Avg/Worst, Space = O(N)
// Not Stable
// https://practice.geeksforgeeks.org/problems/heap-sort/1

class Solution {
    ArrayList<Integer> data;

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

    public int delete() {
        int val = data.get(0);

        Collections.swap(data, 0, data.size() - 1);
        data.remove(data.size() - 1);

        downheapify(0);
        return val;
    }

    public void heapSort(int arr[], int n) {
        data = new ArrayList<>();

        for (int val : arr)
            data.add(val);

        for (int idx = n - 1; idx >= 0; idx--)
            downheapify(idx);

        for (int idx = 0; idx < n; idx++)
            arr[idx] = delete();
    }
}
