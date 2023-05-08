import java.util.*;

class Solution59 {

    public static void printFactorial(int n) {
        int result = 1;
        for (int idx = 1; idx <= n; idx++) {
            result = result * idx;
        }
        System.out.println("Factorial : " + result);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("N = " + n);

        printFactorial(n);
        System.out.println("Main Method Ended");

    }
}