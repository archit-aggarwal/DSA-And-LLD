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

// Time = O(N * K), Space = O(1)
// Merging Two At a Time
class Solution1 {
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

    public ListNode mergeKLists(ListNode[] arr) {
        ListNode res = null;
        for (ListNode head : arr) {
            res = merge(res, head);
        }
        return res;
    }
}

// Time = O(N * K), Space = O(log K) Recursion Stack Space
// Divide & Conquer
class Solution2 {
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

    public ListNode helper(ListNode[] arr, int left, int right) {
        if (left == right)
            return arr[left];
        int mid = (left + right) / 2;
        ListNode l1 = helper(arr, left, mid);
        ListNode l2 = helper(arr, mid + 1, right);
        return merge(l1, l2);
    }

    public ListNode mergeKLists(ListNode[] arr) {
        if (arr.length == 0)
            return null;
        return helper(arr, 0, arr.length - 1);
    }
}