// https://www.programiz.com/java-programming/examples/swap-two-numbers

// Time: O(1) - Space O(1)

import java.util.*;

class Main {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        // Wrong Logic
        // a = b;
        // b = a;

        // Approach 1
        int temp = a;
        a = b;
        b = temp;

        // Approach 2
        a = a + b;
        b = a - b;
        a = a - b;
    }
}
