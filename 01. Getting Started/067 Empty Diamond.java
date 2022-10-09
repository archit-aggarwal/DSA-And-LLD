import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n = scn.nextInt();
    int space = 1;
     int k = n/2 + 1;
     
     for(int i=1;i<=k;i++) {
         for(int sp=1;sp<=k-i;sp++) {
             System.out.print("	");
         }
         
         System.out.print("*	");
         if(i == 1) {
             System.out.println();
             continue;
         }
         
         for(int sp=1;sp<=space;sp++) {
             System.out.print("	");
         }
         
         System.out.println("*");
         space += 2;
     }
     
     space -= 4; //this is explained in the class
     
     for(int i=1;i<=n-k;i++) {
         for(int sp=1;sp<=i;sp++) {
             System.out.print("	");
         }
         
         System.out.print("*	");
         if(i == n-k) {
             System.out.println();
             continue;
         }
         
         for(int sp=1;sp<=space;sp++) {
             System.out.print("	");
         }
         
         System.out.print("*	");
         
         space -=2;
         System.out.println();
         
     }
     
 }
}
