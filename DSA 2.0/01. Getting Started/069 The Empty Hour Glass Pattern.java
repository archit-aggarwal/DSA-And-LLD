import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();
     int k = n/2 + 1;
     
     //upper half
     
     for(int i=1;i<=n-k;i++) {
         if(i == 1) {
             for(int j=1;j<=n;j++) {
                 System.out.print("*	");
             }
         } else {
             for(int j=1;j<=n;j++) {
                 if(j == i || i+j == n+1) {
                     System.out.print("*	");
                 } else {
                     System.out.print("	");
                 }
             }
         }
         
         System.out.println();
     }
     
     //lower half
    
    for(int i=1;i<=k;i++) {
        for(int sp=1;sp<=k-i;sp++) {
            System.out.print("	");
        }
        
        for(int j=1;j<=2*i-1;j++) {
            System.out.print("*	");
        }
        
        System.out.println();
    }
 }
}
