public class Solution {

	public static void printPattern(int n) {
        int k = n/2 + 1;
        
        //first half
        for(int i=1;i<=k;i++) {
            //spaces
            for(int sp=1;sp<=k-i;sp++) {
                System.out.print(" ");
            }
            
            //stars
            for(int j=1;j<=2*i-1;j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        //second half
        int stars = n-2;
        for(int i=1;i<=n-k;i++) {
            
            //spaces
            for(int sp=1;sp<=i;sp++) {
                System.out.print(" ");
            }
            
            //stars
            
            for(int j=1;j<=stars;j++) {
                System.out.print("*");
            }
            
            System.out.println();
            stars -= 2;
        }
        
	}
}
