// https://practice.geeksforgeeks.org/problems/binary-representation5003/1
// Time = O(32), Space = O(1)

class Solution {
    static String getBinaryRep(int N) {
        // given base = decimal = 10
        // required base = binary = 2

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 30; i++) {
            res.append(N & 1);
            N = N >> 1;
        }

        return res.reverse().toString();
    }
}