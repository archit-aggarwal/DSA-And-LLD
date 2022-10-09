class Solution{
    static long factorial(int n){
        // code here
        if(n == 0) return 1L;
        long product = 1L;
        for(int i=n;i>=1;i--) {
            product = product * i;
        }
        
        return product;
    }
}
