import java.util.*;
// https://leetcode.com/problems/implement-queue-using-stacks/

// Approach 1: Push Efficient
class MyStack1 {
    Queue<Integer> q = new ArrayDeque<>();

    public void push(int x) {
        q.add(x);
    }

    public int pop() {
        int n = q.size();
        for (int i = 1; i < n; i++) {
            q.add(q.remove());
        }
        return q.remove();
    }

    public int top() {
        int n = q.size();
        for (int i = 1; i < n; i++) {
            q.add(q.remove());
        }
        int ans = q.remove();
        q.add(ans);
        return ans;
    }

    public boolean empty() {
        return (q.size() == 0);
    }
}

// Approach 2: Pop Efficient
class MyStack2 {
    Queue<Integer> q = new ArrayDeque<>();

    public void push(int x) {
        q.add(x);
        for (int i = 1; i < q.size(); i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return (q.size() == 0);
    }
}
