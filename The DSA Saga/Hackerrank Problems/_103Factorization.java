package Day17;

import java.util.*;

public class _103Factorization {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        factorization(n);
    }

    public static void factorization(int n) {
        // for (int f = 1; f <= n; f++) {
        //     if (n % f == 0)
        //         System.out.println(f);
        // }

        int root = (int)Math.sqrt(n);
        for (int f = 1; f < root; f++) {
            if (n % f == 0)
                System.out.println(f);
        }

        for(int f = root; f >= 1; f--){
            if(n % f == 0)
                System.out.println(n / f);
        }
    }
}
