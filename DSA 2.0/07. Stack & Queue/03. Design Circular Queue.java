// https://leetcode.com/problems/design-circular-queue/description/

class MyCircularQueue {
    int[] arr;
    int front, rear, size;

    public MyCircularQueue(int k) {
        arr = new int[k];
        front = rear = size = 0;
    }

    // insert at last
    public boolean enQueue(int value) {
        if (isFull() == true)
            return false;

        arr[rear] = value;
        rear = (rear + 1) % arr.length;
        size++;
        return true;
    }

    // remove at front
    public boolean deQueue() {
        if (isEmpty() == true)
            return false;

        front = (front + 1) % arr.length;
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty() == true)
            return -1;
        return arr[front];
    }

    public int Rear() {
        if (isEmpty() == true)
            return -1;
        if (rear == 0)
            return arr[arr.length - 1];
        return arr[rear - 1];
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == arr.length);
    }
}