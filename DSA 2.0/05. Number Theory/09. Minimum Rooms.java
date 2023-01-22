// https://practice.geeksforgeeks.org/problems/required-rooms3939/1

class Solution {
    static int GCD(int A, int B) {
        if (B == 0)
            return A;
        return GCD(B, A % B);
    }

    static int rooms(int A, int B) {
        int roomSize = GCD(A, B);
        int minRooms = (A + B) / roomSize;
        return minRooms;
    }
}