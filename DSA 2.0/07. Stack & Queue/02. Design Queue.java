// https://practice.geeksforgeeks.org/problems/implement-queue-using-array/1
// Using Array
class MyQueue1 {

    int front = 0, rear = 0;
    int arr[] = new int[100005];

    void push(int val) {
        if (rear == arr.length)
            return; // Overflow: Full
        arr[rear] = val;
        rear++;
    }

    int pop() {
        if (front == rear)
            return -1; // underflow: Empty
        int val = arr[front];
        front++;
        return val;
    }
}

// https://practice.geeksforgeeks.org/problems/implement-queue-using-linked-list/1
// Using Linked List
class MyQueue {
    QueueNode front, rear;

    void push(int val) {
        QueueNode temp = new QueueNode(val);

        if (front == null) {
            front = rear = temp;
        } else {
            rear.next = temp;
            rear = temp;
        }
    }

    int pop() {
        if (front == null)
            return -1;

        int val = front.data;
        front = front.next;
        return val;
    }
}