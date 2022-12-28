import java.util.*;
// https://leetcode.com/problems/min-stack/
// Time = O(N), Space = O(N)

class MinStack {
    Stack<Integer> main, min;

    MinStack() {
        main = new Stack<>();
        min = new Stack<>();
        min.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        main.push(val);
        min.push(Math.min(val, min.peek()));
    }

    public void pop() {
        min.pop();
        main.pop();
    }

    public int top() {
        return main.peek();
    }

    public int getMin() {
        return min.peek();
    }
}