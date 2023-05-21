package Day16;

import java.util.*;

public class _99SwapXYZ {
    public static void swap(int x, int y, int z) {
        int backup = z;
        z = y; // assign y to z
        y = x; // assign x to y
        x = backup; // assign z to x

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }

    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();

        swap(x, y, z);
    }
}
