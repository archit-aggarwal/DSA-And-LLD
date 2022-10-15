import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i <= n; i++) {
            // numbers
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "\t");
                num++;
            }

            // leave line
            System.out.println();
        }
    }
}
