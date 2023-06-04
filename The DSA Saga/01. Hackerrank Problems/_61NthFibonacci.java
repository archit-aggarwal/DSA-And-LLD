package Day11;

import java.util.*;

public class _61NthFibonacci {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ptr1 = 0, ptr2 = 1, ptr3 = 1;

        // O(N) linear => N max = 10 ^ 8
        for (int idx = 1; idx <= n; idx++) {
            ptr3 = ptr1 + ptr2;
            ptr1 = ptr2;
            ptr2 = ptr3;
        }

        System.out.println(ptr1);
    }
}
