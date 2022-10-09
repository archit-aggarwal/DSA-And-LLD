//TC : O(N)
//SC : O(logN)

class Solution {
    
    public double power(double x, int n) {
        if(n == 0) return 1;
        
        if(n % 2 == 0)
            return power(x,n/2) * power(x,n/2);
        
        return x * power(x,n/2) * power(x,n/2);
        
    }
    
    public double myPow(double x, int n) {
        if(n < 0) {
            return 1.0 / power(x,-n);
        }
        
        return power(x,n);
    }
}
