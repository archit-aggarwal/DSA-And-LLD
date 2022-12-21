// Leetcode 143: https://leetcode.com/problems/reorder-list/description/
// Time = O(N), Space = O(1) Inplace

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode reverse(ListNode head) {
        ListNode curr = head, prev = null;

        while (curr != null) {
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }

        return prev;
    }

    public ListNode middle(ListNode head) {
        ListNode prev = null, slow = head, fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;
        return slow;
    }

    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;

        // Get the Middle Node
        ListNode mid = middle(head);

        // Reverse the Right Half
        ListNode l1 = head;
        ListNode l2 = reverse(mid);

        // Take Alternate Nodes
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (l1 != null || l2 != null) {
            if (l1 != null) {
                tail.next = l1;
                tail = l1;
                l1 = l1.next;
            }

            if (l2 != null) {
                tail.next = l2;
                tail = l2;
                l2 = l2.next;
            }
        }
    }
}