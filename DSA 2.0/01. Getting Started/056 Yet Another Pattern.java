public class Solution {

	public static void ninjaPuzzle(int n) {

		// Write your code here.
        
        for(int i=1;i<=n;i++) {
            //space
            
            for(int sp=1;sp<=i-1;sp++) {
                System.out.print(" ");
            }
            
            //stars
            
            for(int j=1;j<=n-i+1;j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
	}
}
