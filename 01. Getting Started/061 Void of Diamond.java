import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n = scn.nextInt();
        
        int k= n/2 + 1;
        
        int stars = k;
        for(int i=1;i<=k;i++) {
            
            for(int j=1;j<=stars;j++) {
                System.out.print("*\t");
            }
            
            //spaces
            
            for(int sp=1;sp<=2*i-1;sp++) {
                System.out.print("\t");
            }
            
            for(int j=1;j<=stars;j++) {
                System.out.print("*\t");
            }
            
            System.out.println();
            stars--;
        }
        
        stars = 2;
        int space = n-2;
        
        for(int i=1;i<=n-k;i++) {
            //stars
            for(int j=1;j<=stars;j++) {
                System.out.print("*\t");
            }
            
            for(int sp=1;sp<=space;sp++) {
                System.out.print("\t");
            }
            
            
            for(int j=1;j<=stars;j++) {
                System.out.print("*\t");
            }
            
            System.out.println();
            stars++;
            space -=2;
        }

    }
}
