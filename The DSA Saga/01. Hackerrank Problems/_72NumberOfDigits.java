package Day12;
import java.util.*;

public class _72NumberOfDigits {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int digits = 0;

        // logarithmic = O(log n)
        for (int idx = n; idx != 0; idx /= 10) {
            digits++;
        }
        System.out.println(digits);
    }
}
