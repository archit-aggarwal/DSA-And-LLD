import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
    int n = scn.nextInt();
    
    for(int i=1;i<=n;i++) {
        if(i == 1) {
            for(int j=1;j<=n;j++) {
                if(j <= n/2 + 1 || j == n) {
                    System.out.print("*	");
                } else {
                    System.out.print("	");
                }
            }
        } else if(i <= n/2) {
            for(int j=1;j<=n;j++) {
                if(j == n/2 + 1 || j == n) {
                    System.out.print("*	");
                } else {
                    System.out.print("	");
                }
            }
        } else if(i == n/2 + 1) {
            for(int j=1;j<=n;j++) {
                System.out.print("*	");
            }
        } else if(i <= n-1) {
            for(int j=1;j<=n;j++) {
                if(j == n/2 + 1 || j == 1) {
                    System.out.print("*	");
                } else {
                    System.out.print("	");
                }
            }
        } else {
            for(int j=1;j<=n;j++) {
                if(j >= n/2 + 1 || j == 1) {
                    System.out.print("*	");
                } else {
                    System.out.print("	");
                }
            }
        }
        
        System.out.println();
    }  
 }
}
