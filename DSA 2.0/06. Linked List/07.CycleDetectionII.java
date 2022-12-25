// https://leetcode.com/problems/linked-list-cycle-ii/description/ 
// LC 142
// Floyd's Cycle Detection 

// Time = O(N), Space = O(1)

class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                break; // meeting point
        }

        if (fast == null || fast.next == null)
            return null;

        // dist(meeting pt - starting pt) = dist(starting pt - head)
        while (head != slow) {
            head = head.next;
            slow = slow.next;
        }

        return slow; // starting point
    }
}