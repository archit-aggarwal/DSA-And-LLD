// https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/description/

class Solution {
    public int countTriplets(int[] arr) {
        int ans = 0;
        for (int l = 0; l < arr.length; l++) {
            int xor = 0;
            for (int r = l; r < arr.length; r++) {
                xor = xor ^ arr[r];
                if (xor == 0)
                    ans += (r - l);
            }
        }
        return ans;
    }
}