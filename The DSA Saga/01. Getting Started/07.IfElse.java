// https://practice.geeksforgeeks.org/problems/java-if-else-decision-making0924/1

class Solution {
    static String compareNM(int n, int m) {
        if (n < m) {
            return "lesser";
        }
        if (n > m) {
            return "greater";
        }
        return "equal";
    }
}