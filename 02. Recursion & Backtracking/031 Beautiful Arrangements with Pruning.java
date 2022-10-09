//Link: https://leetcode.com/problems/beautiful-arrangement/
//TC: O(N!)
//RS: O(N)

class Solution {
    
    int count;
    
    public void permutations(int n,int idx,boolean[] vis) {
        
        if(idx > n) {
            count++;
            return;
        }
        
        for(int num=1;num<=n;num++) {
            if(vis[num] == false && (num % idx == 0 || idx % num == 0)) {
                vis[num] = true;
                permutations(n,idx + 1,vis);
                vis[num] = false;
            } 
        }
    }
    
    public int countArrangement(int n) {
        count = 0;
        permutations(n,1,new boolean[n+1]);
        return count;
    }
}
