//Link: https://leetcode.com/problems/beautiful-arrangement/
//TC: O(N!)
//RS: O(N)

class Solution {
    
    int count;
    
    public void permutations(int n,List<Integer> curr,boolean[] vis) {
        
        if(curr.size() == n) {
            
            for(int i=0;i<n;i++) {
                if(curr.get(i) % (i+1) != 0 && (i+1) % curr.get(i) != 0)
                    return;
            }
            
            count++;
            return;
        }
        
        for(int i=1;i<=n;i++) {
            if(vis[i] == false) {
                curr.add(i);
                vis[i] = true;
                permutations(n,curr,vis);
                //backtracking
                curr.remove(curr.size() -1);
                vis[i] = false;
            } 
        }
    }
    
    public int countArrangement(int n) {
        count = 0;
        permutations(n,new ArrayList<>(),new boolean[n+1]);
        return count;
    }
}
