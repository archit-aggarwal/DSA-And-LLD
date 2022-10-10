//Link : https://leetcode.com/problems/matchsticks-to-square/
//TC : O(4 ^ N)
//RS: O(N)

class Solution {
    
    public boolean dfs(int[] matchsticks,int idx,int[] sides,int sideLength) {
        //base case
        if(idx == matchsticks.length) return true;
        
        for(int i=0;i<4;i++) {
            //pruning
            if(sides[i] + matchsticks[idx] <= sideLength) {
                //place the idxth matchstick on ith side
                sides[i] += matchsticks[idx];
                boolean canWePlaceRemSticks = dfs(matchsticks,idx + 1,sides,sideLength);
                if(canWePlaceRemSticks == true) return true;
                sides[i] -= matchsticks[idx];
            }
        }
        
        return false;
    }
    
    public void reverse(int[] arr) {
        int lo = 0;
        int hi = arr.length -1;
        
        while(lo < hi) {
            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;
            hi--;
        }
    }
    
    public boolean makesquare(int[] matchsticks) {
        if(matchsticks == null || matchsticks.length == 0) return false;
        
        int peri = 0;
        for(int val : matchsticks) peri += val;
        
        if(peri % 4 != 0) return false;
        
        int sideLength = peri / 4;
        int[] sides = new int[4];
        
        //sort in descending order
        Arrays.sort(matchsticks);
        reverse(matchsticks);
        
        return dfs(matchsticks,0,sides,sideLength);
    }
}
