class Solution{
    static int evenlyDivides(int N){
        // code here
        int originalN = N;
        int count = 0;
        
        while(N > 0) {
            int digit = N % 10;
            if(digit != 0 && originalN % digit == 0) {
                count++;
            }
            N /= 10;
        }
        
        return count;
    }
}
