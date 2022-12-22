// https://leetcode.com/problems/sort-list/description/
// Time = O(N * Log N), Space = O(log N) Recursion Stack Space = O(1) Inplace

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
    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                tail = tail.next;
                list1 = list1.next;
            } else {
                tail.next = list2;
                tail = tail.next;
                list2 = list2.next;
            }
        }

        if (list1 != null)
            tail.next = list1;
        else
            tail.next = list2;
        return dummy.next;
    }

    public ListNode middle(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode slow = head, fast = head, prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;
        return slow;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode mid = middle(head);
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(mid);
        return merge(l1, l2);
    }
}