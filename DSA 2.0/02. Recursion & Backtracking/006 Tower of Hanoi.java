//Link : https://practice.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1
//TC : O(2 ^ N)
//Recursion Space: O(N)

class Hanoi {

    // t1 -> src t2-> dest t3-> aux
    public long toh(int N, int t1, int t2, int t3) {
        // Your code here
        
        if(N == 0) return 0;
        
        long ans1 = toh(N-1,t1,t3,t2);
        System.out.println("move disk " + N + " from rod " + t1 + " to rod " + t2);
        long ans2 = toh(N-1,t3,t2,t1);
        
        return ans1 + ans2 + 1;
    }
}
