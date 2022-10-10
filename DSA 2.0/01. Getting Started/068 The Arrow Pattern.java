import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        for(int i=1;i<=n;i++) {
            if(i == n/2 + 1) {
                for(int j=1;j<=n;j++) {
                    System.out.print("*	");
                }
                
            } else if(i <= n/2) {
                //upper half
                
                for(int sp=1;sp<=n/2;sp++) {
                    System.out.print("	");
                }
                
                for(int j=1;j<=i;j++) {
                    System.out.print("*	");
                }
            } else {
                for(int sp=1;sp<=n/2;sp++) {
                    System.out.print("	");
                }
                
                for(int j=1;j<=n-i+1;j++) {
                    System.out.print("*	");
                }
            }
            System.out.println();
        }
        
    }
}
