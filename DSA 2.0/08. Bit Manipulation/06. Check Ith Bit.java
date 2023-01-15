// https://practice.geeksforgeeks.org/problems/check-whether-k-th-bit-is-set-or-not-1587115620/1

class CheckBit {
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k) {
        int mask = 1 << k;
        if ((n & mask) == 0)
            return false;
        return true;
        // return (n & (1 << k)) != 0;
    }

}