//Link : https://leetcode.com/problems/subsets/
//TC: O(2 ^ N)
//Recursion Space : O(N)

class Solution {
    
    List<List<Integer>> ans;
    
    public void subsets(int[] nums,int idx,List<Integer> curr) {
        
        if(idx == nums.length) {
            //deep copy
            List<Integer> copy = new ArrayList<>(curr);
            ans.add(copy);
            return;
        }
        
        //no
        subsets(nums,idx + 1,curr);
        
        //yes
        curr.add(nums[idx]);
        subsets(nums,idx + 1,curr);
        curr.remove(curr.size() -1); //backtracking
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        
        ans = new ArrayList<>();
        subsets(nums,0,new ArrayList<>());
        return ans;
    }
}
