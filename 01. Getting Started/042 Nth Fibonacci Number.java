class Solution {
    static long nthFibonacci(long n){
        // code here
        
        long a = 0L;
        long b = 1L;
        long c = 0L;
        
        for(int i=2;i<=n;i++) {
            c = (a + b) % 1000000007;
            a = b;
            b = c;
        }
        
        return c;
    }
}
