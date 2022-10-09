//Link : https://practice.geeksforgeeks.org/problems/factorial5739/1
//TC: O(N)
//Recursion Space: O(N)  

class Solution{
    static long factorial(int N){
        // code here
        if(N == 0) return 1L;
        
        long nm1Factorial = factorial(N-1);
        return N * nm1Factorial;
    }
}
