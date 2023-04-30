package Day15;

import java.util.*;

public class _91RotateDigits {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int d = 7, k = 3;
        // Approach 2:

        int b = n % (int) Math.pow(10, k);
        int a = n / (int) Math.pow(10, k);
        int result = b * (int) Math.pow(10, d - k) + a;
        System.out.println(result);
    }
}
