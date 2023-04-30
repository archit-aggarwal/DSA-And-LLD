// https://practice.geeksforgeeks.org/problems/pattern-printing1347/1

class Solution {
    static void printPattern(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
        }
    }
}