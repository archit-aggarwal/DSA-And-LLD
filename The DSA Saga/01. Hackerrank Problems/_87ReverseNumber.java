package Day15;

import java.util.*;

public class _87ReverseNumber {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int tests = scn.nextInt();

        // O(t log n)

        // while (tests-- > 0) {
        for (int t = 0; t < tests; t++) {

            int input = scn.nextInt();
            int output = 0;

            while (input > 0) {
                int digit = input % 10;
                output = 10 * output + digit;
                input /= 10;
            }

            System.out.println(output);
        }
    }
}
