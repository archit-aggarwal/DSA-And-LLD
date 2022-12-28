// https://leetcode.com/problems/design-circular-deque/description/

class MyCircularDeque {
    int[] arr;
    int front, rear, size;

    public MyCircularDeque(int k) {
        arr = new int[k];
        front = rear = size = 0;
    }

    public boolean insertFront(int value) {
        if (isFull() == true)
            return false;

        front = (front - 1 + arr.length) % arr.length;
        arr[front] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull() == true)
            return false;

        arr[rear] = value;
        rear = (rear + 1) % arr.length;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty() == true)
            return false;

        front = (front + 1) % arr.length;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty() == true)
            return false;

        rear = (rear - 1 + arr.length) % arr.length;
        size--;
        return true;
    }

    public int getFront() {
        if (isEmpty() == true)
            return -1;
        return arr[front];
    }

    public int getRear() {
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