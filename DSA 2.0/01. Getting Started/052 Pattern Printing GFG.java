class Solution{
    static void printPattern(int n){
        // code here
        
        for(int i=1;i<=n;i++) {
            
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            
            System.out.print(" ");
        }
    }
}
