// GfG: https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1

// Structure of node
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG {
    int twoPassAlgo(Node head, int k) {
        // pass 1: count number of nodes
        int n = 0;
        Node curr = head;

        while (curr != null) {
            curr = curr.next;
            n++;
        }

        if (k <= 0 || k > n)
            return -1;

        // pass 2:
        // kth node from end = (n - k)th node from start
        curr = head;
        for (int i = 0; i < n - k; i++) {
            curr = curr.next;
        }
        return curr.data;
    }

    int onePassAlgo(Node head, int k) {
        Node slow = head, fast = head;

        // Fast should be k dist ahead of slow
        for (int i = 0; i < k; i++) {
            if (fast == null)
                return -1;
            fast = fast.next;
        }

        // Sliding Window
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }

    int getNthFromLast(Node head, int k) {
        return onePassAlgo(head, k);
    }
}