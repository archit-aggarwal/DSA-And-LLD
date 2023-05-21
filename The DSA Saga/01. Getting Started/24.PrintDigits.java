// https://www.hackerrank.com/contests/module-1-java-dsa-class-challenges/challenges/print-all-digits-from-end/problem

import java.util.*;

// Time complexity: O(log N) Space complexity: O(1)

class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while (n != 0) {
            int digit = n % 10;
            System.out.println(digit);
            n /= 10; // n = n / 10
        }

        scn.close();
    }
}