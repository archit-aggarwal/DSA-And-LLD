package Day08;

import java.util.*;

public class _37PrintRange {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // O(N) Linear
        for (int idx = 1; idx <= n; idx++) {
            System.out.println(idx);
        }
    }
}