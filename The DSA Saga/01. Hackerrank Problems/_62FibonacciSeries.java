package Day11;
import java.util.*;

public class _62FibonacciSeries {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ptr1 = 0, ptr2 = 1, ptr3 = 1;
        
        // O(n) linear
        for (int idx = 1; idx <= n; idx++) {
            System.out.print(ptr1 + " ");
            ptr3 = ptr1 + ptr2;
            ptr1 = ptr2;
            ptr2 = ptr3;
        }

    }
}
