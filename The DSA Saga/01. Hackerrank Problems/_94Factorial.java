package Day16;

import java.util.*;

public class _94Factorial {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = factorial(n);
        System.out.println(ans);
    }

    public static int factorial(int n) {
        int ans = 1;
        for (int idx = n; idx >= 1; idx--) {
            ans = ans * idx;
        }
        return ans;
    }
}
