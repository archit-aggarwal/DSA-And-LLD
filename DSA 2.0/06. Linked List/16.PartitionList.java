// https://leetcode.com/problems/partition-list/description/
// Leetcode 86: Time = O(N), Space = O(1) Inplace, Stable

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
    public ListNode partition(ListNode curr, int pivot) {
        ListNode ldummy = new ListNode(-1);
        ListNode rdummy = new ListNode(-1);
        ListNode left = ldummy, right = rdummy;

        while (curr != null) {
            if (curr.val < pivot) {
                left.next = curr;
                left = curr;
                curr = curr.next;
            } else {
                right.next = curr;
                right = curr;
                curr = curr.next;
            }
        }

        left.next = rdummy.next;
        right.next = null;
        return ldummy.next;
    }
}