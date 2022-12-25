// https://leetcode.com/problems/reverse-nodes-in-k-group/description/
// Leetcode 25: Time = O(N), Space = O(1)

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
    public int size(ListNode curr) {
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode curr, int k) {
        int n = size(curr);
        ListNode resHead = new ListNode(-1);
        ListNode resTail = resHead;

        while (curr != null) {
            if (n < k) {
                // Group Length < K: Do Not Reverse
                resTail.next = curr;
                break;
            }

            n -= k;
            ListNode groupHead = new ListNode(-1);
            ListNode groupTail = groupHead;

            for (int idx = 0; idx < k; idx++) {
                groupTail.next = curr;
                groupTail = curr;
                curr = curr.next;
            }

            groupTail.next = null;
            groupHead = groupHead.next;
            reverse(groupHead);
            resTail.next = groupTail;
            resTail = groupHead;
        }

        return resHead.next;
    }
}