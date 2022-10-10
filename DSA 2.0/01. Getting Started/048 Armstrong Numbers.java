class Solution {
    static String armstrongNumber(int n){
        // code here
        
        int originalN = n;
        int ans = 0;
        while(n > 0) {
            int d = n % 10;
            n/=10;
            ans += d*d*d;
        }
        
        if(ans == originalN) return "Yes";
        return "No";
    }
}
