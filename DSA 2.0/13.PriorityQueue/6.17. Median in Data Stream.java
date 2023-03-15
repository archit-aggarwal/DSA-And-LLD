import java.util.*;
// https://leetcode.com/problems/find-median-from-data-stream/description/
// Time = O(N * Log N), Space = O(N) Extra Space

class MedianFinder {
    PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> right = new PriorityQueue<>();
    // left -> max heap, right -> min heap

    public void addNum(int num) {
        if (left.size() == 0 || num < left.peek())
            left.add(num);
        else
            right.add(num);

        int bf = left.size() - right.size();
        if (bf == 0 || bf == 1)
            return;

        if (bf > 1)
            right.add(left.remove());
        else
            left.add(right.remove());
    }

    public double findMedian() {
        int size = left.size() + right.size();
        if (size % 2 == 0)
            return (left.peek() + right.peek()) / 2.0;
        else
            return left.peek();
    }
}
