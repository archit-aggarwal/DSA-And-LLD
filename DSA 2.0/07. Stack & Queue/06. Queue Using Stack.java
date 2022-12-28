import java.util.*;
// https://leetcode.com/problems/implement-queue-using-stacks/

// Approach 1: Push Efficient
class MyQueue1 {
    Stack<Integer> main = new Stack<>();
    Stack<Integer> extra = new Stack<>();

    public void push(int x) {
        main.push(x);
    }

    public int pop() {
        while (main.size() != 0) {
            extra.push(main.pop());
        }
        int ans = extra.pop();

        while (extra.size() != 0) {
            main.push(extra.pop());
        }
        return ans;
    }

    public int peek() {
        while (main.size() != 0) {
            extra.push(main.pop());
        }
        int ans = extra.peek();

        while (extra.size() != 0) {
            main.push(extra.pop());
        }
        return ans;
    }

    public boolean empty() {
        return (main.size() == 0);
    }
}

// Approach 2: Pop Efficient
class MyQueue2 {
    Stack<Integer> main = new Stack<>();
    Stack<Integer> extra = new Stack<>();

    public void push(int x) {
        while (main.size() != 0) {
            extra.push(main.pop());
        }

        main.push(x); // push at bottom

        while (extra.size() != 0) {
            main.push(extra.pop());
        }
    }

    public int pop() {
        return main.pop();
    }

    public int peek() {
        return main.peek();
    }

    public boolean empty() {
        return (main.size() == 0);
    }
}
