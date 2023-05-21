// https://practice.geeksforgeeks.org/problems/factorial5739/1#

// Time complexity: O(N) Space complexity: O(1)

class Solution {
    static long factorial(int N) {
        long product = 1;
        for (int idx = 1; idx <= N; idx++) {
            product = product * idx;
        }
        return product;
    }
}