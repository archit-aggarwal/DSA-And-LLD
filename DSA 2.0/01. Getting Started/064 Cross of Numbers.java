public class Solution {

    public static void ninjaPattern(int N) {

        // Write your code here.
        // N= 3
        // n = 2*N-1

        int n = 2 * N - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    if (i <= n / 2 + 1)
                        System.out.print(i);
                    else
                        System.out.print(n - i + 1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
