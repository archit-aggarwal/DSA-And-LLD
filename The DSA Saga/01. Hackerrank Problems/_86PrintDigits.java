package Day15;

import java.util.*;

public class _86PrintDigits {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // O(log n) logarithmic: Never Give TLE
        while (n > 0) {
            int digit = n % 10;
            System.out.println(digit);
            n /= 10;
        }
    }
}
