import java.util.*;
// https://www.geeksforgeeks.org/rotate-digits-of-a-given-number-by-k/
// OR
// https://www.pepcoding.com/resources/online-java-foundation/getting-started/rotate_a_number/topic

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        scn.close();

        int d = 0;
        for (int N = n; N != 0; N /= 10) {
            d++;
        }

        k = (k % d + d) % d;
        // big k or negative k converted to [0, k - 1]

        int a = n % (int) Math.pow(10, k);
        int b = n / (int) Math.pow(10, k);
        int res = a * (int) Math.pow(10, d - k) + b;
        // 567 * 10 ^ 4 + 1234
        System.out.println(res);
    }
}