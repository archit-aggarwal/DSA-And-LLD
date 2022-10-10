class Solution {
    
    static long divisionMethod(long a, long b) {
        while(a % b != 0) {
            long rem = a%b;
            a = b;
            b = rem;
        }
        
        return b;
    }
    
    static long gcd(long a,long b) {
        
        long originalA = a;
        
        while(a >= 1) {
            if(originalA % a == 0 && b % a == 0) return a;
            a--;
        }
        
        return 1L;
    }
    
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        
        long gcd = divisionMethod(A,B);
        long lcm = (A*B)/gcd;
        
        Long[] res = new Long[2];
        res[0] = lcm;
        res[1] = gcd;
        return res;
    }
};
