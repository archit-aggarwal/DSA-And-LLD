package Day15;

import java.util.*;

public class _89ReverseNDigitNo {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Print XYZW... (Form Number From Digits)
        int digits = scn.nextInt();
        int input = 0;
        while (digits-- > 0) {
            int digit = scn.nextInt();
            input = input * 10 + digit;
        }
        System.out.println(input);

        // Reverse N Digit Number
        int output = 0;
        while (input > 0) {
            int digit = input % 10;
            output = 10 * output + digit;
            input /= 10;
        }
        System.out.println(output);
    }
}
