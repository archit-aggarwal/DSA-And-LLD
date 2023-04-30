package Day16;

import java.util.*;

public class _98SwapXY {
    public static void swap(int x, int y) {
        int c = x; // assign x to c
        System.out.println("c = " + c);

        x = y; // assign y to x
        System.out.println("x = " + x);

        y = c; // assign c to y
        System.out.println("y = " + y);

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // O(1) constant
        int x = scn.nextInt();
        int y = scn.nextInt();

        swap(x, y);
    }
}
