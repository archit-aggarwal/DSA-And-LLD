class Solution {
    
    public double power(double x, int n) {
        if(n == 0) return 1;
        
        double smallAns = power(x,n/2);
        
        if(n % 2 == 0)
            return smallAns * smallAns;
        
        return x * smallAns * smallAns;
        
    }
    
    public double myPow(double x, int n) {
        if(n < 0) {
            return 1.0 / power(x,-n);
        }
        
        return power(x,n);
    }
}
