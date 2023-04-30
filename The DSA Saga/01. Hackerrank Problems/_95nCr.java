package Day16;

import java.util.*;

public class _95nCr {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int r = scn.nextInt();

        int a = factorial(n);
        int b = factorial(n - r);
        int c = factorial(r);

        int ans = a / (b * c);
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
