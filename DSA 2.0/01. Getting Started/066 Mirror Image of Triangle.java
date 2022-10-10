
public class Solution {
	public static void NumberPattern(int n) {
		// Write your code here
        
        for(int i=0;i<=n;i++) {
            
            int num = i;
            
            for(int sp=1;sp<=n-i;sp++) {
                System.out.print(" ");
            }
            
            for(int j=1;j<=2*i+1;j++) {
                System.out.print(num);
                if(j < (2*i +1)/2 + 1) {
                    num--;
                } else {
                    num++;
                }
            }
            
            System.out.println();
        }
        
	}

}
