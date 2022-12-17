/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// LC 876: https://leetcode.com/problems/middle-of-the-linked-list/description/

class Solution {
    // Total Time = O(N), Space = O(1)
    public ListNode twoPassAlgo(ListNode head) {
        // Pass 1: Count Number of Nodes
        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            curr = curr.next;
            count++;
        }

        // Pass 2: Return the N/2th Node of LL
        curr = head;
        for (int i = 0; i < count / 2; i++)
            curr = curr.next;
        return curr;
    }

    // Total Time = O(N), Space = O(1)
    public ListNode onePassAlgo(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode middleNode(ListNode head) {
        // return twoPassAlgo(head);
        return onePassAlgo(head);
    }
}