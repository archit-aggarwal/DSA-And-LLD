// https://practice.geeksforgeeks.org/problems/implement-stack-using-array/1

// Using Array
class MyStack1 {
    int top = 999;
    int arr[] = new int[1000];

    // Function to push an integer into the stack.
    void push(int val) {
        if (top == -1)
            return; // stack overflow

        arr[top] = val;
        top--;
    }

    // Function to remove an item from top of the stack.
    int pop() {
        if (top == arr.length - 1)
            return -1; // stack underflow

        top++;
        return arr[top];
    }
}

// Using ArrayList
class MyStack2 {
    ArrayList<Integer> arr = new ArrayList<>();

    // Function to push an integer into the stack.
    void push(int val) {
        arr.add(val); // insert in the last of arraylist
    }

    // Function to remove an item from top of the stack.
    int pop() {
        if (arr.size() == 0)
            return -1; // stack underflow
        return arr.remove(arr.size() - 1);
    }
}

// https://practice.geeksforgeeks.org/problems/implement-stack-using-linked-list/1
// Using Linked List
class MyStack3 {
    StackNode top;

    // Function to push an integer into the stack.
    void push(int val) {
        StackNode temp = new StackNode(val);
        temp.next = top;
        top = temp;
    }

    // Function to remove an item from top of the stack.
    int pop() {
        if (top == null)
            return -1;
        int val = top.data;
        top = top.next;
        return val;
    }
}