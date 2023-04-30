package Day15;

import java.util.*;

public class _88PrintXYZW {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int digits = scn.nextInt();
        int output = 0;

        while (digits-- > 0) {
            int digit = scn.nextInt();
            output = output * 10 + digit;
        }

        System.out.println(output);
    }
}
