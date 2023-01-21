// https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1

// Time = O(N), Space = O(N)
// Recurrence Relation: T(N) = T(N - 1) + 1

class Solution {
    public void printNos(int N) {
        if (N == 0)
            return;
        printNos(N - 1);
        System.out.print(N + " ");
    }
}