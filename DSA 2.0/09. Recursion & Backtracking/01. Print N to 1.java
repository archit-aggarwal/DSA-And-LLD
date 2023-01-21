// https://practice.geeksforgeeks.org/problems/print-n-to-1-without-loop/1

// Time = O(N), Space = O(N) Recursion Call Stack Space

class Solution {

    void printNos(int N) {
        if (N == 0)
            return;
        System.out.print(N + " ");
        printNos(N - 1);
    }
}