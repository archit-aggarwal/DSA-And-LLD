// https://practice.geeksforgeeks.org/problems/print-n-to-1-without-loop/1

// time = O(n) ; space = O(n) recursion call stack space

class Solution1 {

    void printNos(int n) {
        // base case
        if (n == 0)
            return;
        // remaining work
        System.out.print(n + " ");

        // faith: recursive call
        printNos(n - 1);
    }
}