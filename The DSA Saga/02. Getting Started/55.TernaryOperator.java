import java.util.*;

class Solution55 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // ODD OR EVEN USING TERNARY OPERATOR
        int n = scn.nextInt();

        String result = (n % 2 == 0) ? "even" : "odd";
        System.out.println(result);

        // MAX OR MIN USING TERNARY OPERATOR
        int a = scn.nextInt();
        int b = scn.nextInt();
        int max = (a > b) ? a : b;
        System.out.println(max);

        int min = (a < b) ? a : b;
        System.out.println(min);
        scn.close();

    }
}