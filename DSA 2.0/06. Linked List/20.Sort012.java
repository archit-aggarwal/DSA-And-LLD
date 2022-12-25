// https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1
// Time = O(N), Space = O(1)

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        Node zeroDummy = new Node(-1);
        Node zero = zeroDummy;
        Node oneDummy = new Node(-1);
        Node one = oneDummy;
        Node twoDummy = new Node(-1);
        Node two = twoDummy;

        while (head != null) {
            if (head.data == 0) {
                zero.next = head;
                zero = zero.next;
            } else if (head.data == 1) {
                one.next = head;
                one = one.next;
            } else if (head.data == 2) {
                two.next = head;
                two = two.next;
            }
            head = head.next;
        }

        two.next = null;
        one.next = twoDummy.next;
        zero.next = oneDummy.next;
        return zeroDummy.next;
    }
}