package Day10;

import java.util.*;

public class _55ReverseString {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        // Approach 1: Printing in Reverse Order
        // Length Times = O(L) or O(N) Linear
        for (int idx = str.length() - 1; idx >= 0; idx--) {
            System.out.print(str.charAt(idx));
        }

        // Approach 2: Reverse String in New Resultant
        String res = "";
        for (int idx = str.length() - 1; idx >= 0; idx--) {
            res = res + str.charAt(idx);
        }
        System.out.println(res);
    }
}
