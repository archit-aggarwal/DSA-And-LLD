// https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1#

// Time: O(N) - Space O(1)

class Solution {
    public void printNos(int N) {
        for (int idx = 1; idx <= N; idx++) {
            System.out.print(idx + " ");
        }
    }
}
