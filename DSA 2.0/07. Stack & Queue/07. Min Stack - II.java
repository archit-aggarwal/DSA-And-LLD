import java.util.*;
// https://leetcode.com/problems/min-stack/
// Time = O(N), Space = O(1)

class MinStack {
    Stack<Long> stk = new Stack<>();
    long min = Integer.MAX_VALUE;

    public void push(int val) {
        if (val < min) {
            long encrypted = 2l * val - min;
            stk.push(encrypted);
            min = val;
        } else {
            stk.push(1l * val);
        }
    }

    public void pop() {
        if (stk.peek() > min) {
            stk.pop();
        } else {
            min = 2l * min - stk.pop();
        }
    }

    public int top() {
        long top = stk.peek();
        if (top > min)
            return (int) top;
        return (int) min;
    }

    public int getMin() {
        return (int) min;
    }
}