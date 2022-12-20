// https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
// Leetcode 81 Easy
// Time = O(N), Space = O(1)

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
    public ListNode deleteDuplicates(ListNode curr) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode tail = dummy;

        while (curr != null) {
            if (curr.val != tail.val) {
                tail.next = curr;
                tail = curr;
            }
            curr = curr.next;
        }

        tail.next = null;
        return dummy.next;
    }
}