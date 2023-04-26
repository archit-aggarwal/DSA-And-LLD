package Day08;

import java.util.*;

public class _38PrintXtoN {
    @SuppressWarnings("all")

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int left = scn.nextInt(); // x
        int right = scn.nextInt(); // n

        // O(right - left) = O(n) linear
        for (int idx = left; idx <= right; idx++) {
            System.out.println(idx);
        }
    }
}