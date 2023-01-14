// https://practice.geeksforgeeks.org/problems/decimal-to-any-base-conversion2440/0
// Time = O(logB N), Space = O(1) Extra

class Solution {
    static char get(int n) {
        if (n < 10)
            return (char) ('0' + n);
        if (n == 10)
            return 'A';
        if (n == 11)
            return 'B';
        if (n == 12)
            return 'C';
        if (n == 13)
            return 'D';
        if (n == 14)
            return 'E';
        return 'F';
    }

    static String getNumber(int B, int N) {
        StringBuilder res = new StringBuilder();

        while (N != 0) {
            char remainder = get(N % B);
            res.append(remainder);
            N = N / B;
        }

        return res.reverse().toString();
    }
}