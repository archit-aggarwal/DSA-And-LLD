import java.util.*;

class Solution61 {

    public static int getFactorial(int x) {
        int fact = 1;
        for (int idx = 1; idx <= x; idx++) {
            fact *= idx;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 5, r = 2;
        int nfact = getFactorial(n);
        System.out.println(n + "! = " + nfact);

        int rfact = getFactorial(r);
        System.out.println(r + "! = " + rfact);

        int nmrfact = getFactorial(n - r);
        System.out.println((n - r) + "! = " + nmrfact);

        int result = nfact / (rfact * nmrfact);
        System.out.println("nCr = " + result);

    }
}