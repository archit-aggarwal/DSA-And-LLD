// https://leetcode.com/problems/delete-node-in-a-linked-list/description/
// LC 237: Time = O(1), Space = O(1)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public void deleteNode(ListNode node) {
        // Store Data of Next Node in Node
        node.val = node.next.val;

        // Delete Next Node
        node.next = node.next.next;
    }
}