// https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1

// time = O(n); space = O(n) recursion call stack space

class Solution2 {

    public void printNos(int n) {
        // base case
        if (n == 0)
            return;
        // faith (recursive call)
        printNos(n - 1);

        // remaining work
        System.out.print(n + " ");
    }

}
