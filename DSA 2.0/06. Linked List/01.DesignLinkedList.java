// Design Singly Linked List: LC 707
// https://leetcode.com/problems/design-linked-list/description/

class ListNode {
    int val;
    ListNode next;
}

class MyLinkedList {
    ListNode head, tail;
    int size = 0;

    public ListNode getNode(int index) {
        if (index < 0 || index >= size)
            return null;

        ListNode curr = head;
        for (int idx = 0; idx < index; idx++) {
            curr = curr.next;
        }
        return curr;
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            return -1;
        return getNode(index).val;
    }

    public void addAtHead(int val) {
        ListNode node = new ListNode();
        node.val = val;
        size++;

        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void addAtTail(int val) {
        ListNode node = new ListNode();
        node.val = val;
        size++;

        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size)
            return;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        ListNode node = new ListNode();
        node.val = val;
        ListNode prev = getNode(index - 1);
        size++;
        node.next = prev.next;
        prev.next = node;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size)
            return;

        size--;
        if (size == 0) {
            // empty linked list
            head = tail = null;
            return;
        }

        if (index == 0) {
            // delete head node
            head = head.next;
            return;
        }

        ListNode prev = getNode(index - 1);
        prev.next = prev.next.next;

        if (index == size) {
            // delete tail node
            tail = prev;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */