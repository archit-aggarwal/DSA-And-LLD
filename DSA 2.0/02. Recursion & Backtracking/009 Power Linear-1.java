//Link : https://leetcode.com/problems/powx-n/
//TC : O(N)
//SC : O(N)

class Solution {
    
    public double power(double x, int n) {
        if(n == 0) return 1;
        
        return x * power(x,n-1);
        
    }
    
    public double myPow(double x, int n) {
        if(n < 0) {
            return 1.0 / power(x,-n);
        }
        
        return power(x,n);
    }
}
