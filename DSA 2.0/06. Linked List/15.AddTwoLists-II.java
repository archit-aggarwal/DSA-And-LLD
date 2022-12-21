// https://leetcode.com/problems/add-two-numbers-ii/description/
// Time = O(N), Space = O(1) Extra Space, O(N) Output Space

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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);

        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            int d1 = (l1 != null) ? l1.val : 0;
            int d2 = (l2 != null) ? l2.val : 0;

            tail.next = new ListNode((d1 + d2 + carry) % 10);
            carry = (d1 + d2 + carry) / 10;

            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
            tail = tail.next;
        }

        return reverse(dummy.next);
    }
}