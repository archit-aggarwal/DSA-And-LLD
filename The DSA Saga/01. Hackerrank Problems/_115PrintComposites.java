package Day19;

import java.util.*;

@SuppressWarnings("all")
public class _115PrintComposites {
    public static boolean isPrime(int n) {
        int root = (int) Math.sqrt(n);
        for (int f = 2; f <= root; f++) {
            if (n % f == 0)
                return false;
        }

        return true;
    }

    public static void printComposites(int[] arr) {
        for (int idx = 0; idx < arr.length; idx++) {
            if (isPrime(arr[idx]) == false)
                System.out.println(arr[idx]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < n; idx++)
            arr[idx] = scn.nextInt();

        printComposites(arr);
    }
}
