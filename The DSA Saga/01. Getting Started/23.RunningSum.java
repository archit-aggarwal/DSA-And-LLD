// https://www.hackerrank.com/contests/module-1-java-dsa-class-challenges/challenges/running-sum-for-loop

// Time: O(N) - Space O(1)

import java.util.*;

class RunningSum {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;

        // O(n) linear
        for (int idx = 1; idx <= n; idx++) {
            int val = scn.nextInt();
            sum += val;
            System.out.print(sum + " ");
        }
    }
}
