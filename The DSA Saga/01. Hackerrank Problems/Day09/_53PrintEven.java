package Day09;

import java.util.*;

public class _53PrintEven {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // O(N) Linear
        for (int idx = 0; idx <= n; idx += 2) {
            System.out.println(idx);
        }
    }
}
