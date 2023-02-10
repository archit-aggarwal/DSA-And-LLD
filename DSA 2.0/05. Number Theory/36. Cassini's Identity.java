// https://practice.geeksforgeeks.org/problems/fibonacci-expression3939/1

// Time = O(1), Space = O(1)

class Solution {
    static int fibExpression(int N) {
        if (N % 2 == 0)
            return 1;
        return -1;
    }
}