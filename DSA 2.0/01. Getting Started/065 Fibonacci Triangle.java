import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                if(i == 1) {
                    System.out.print("0	");
                } else if(i == 2 && j==1) {
                    System.out.print("1	");
                } else {
                    c = a + b;
                    System.out.print(c + "	");
                    a = b;
                    b = c;
                }
            }
            System.out.println();
        }

    }
}
