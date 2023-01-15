// https://practice.geeksforgeeks.org/problems/odd-or-even3618/1

class Solution {
    static String oddEven(int N) {
        if ((N & 1) == 0)
            return "even";
        else
            return "odd";
    }
}