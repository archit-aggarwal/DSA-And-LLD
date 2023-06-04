// https://practice.geeksforgeeks.org/problems/print-n-to-1-without-loop/1#

// Time: O(N) - Space O(1)

class Solution {
    void printNos(int N) {

        for (int idx = N; idx >= 1; idx--) {
            System.out.print(idx + " ");
        }

    }
}