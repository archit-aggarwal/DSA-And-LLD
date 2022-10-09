//Link : https://leetcode.com/problems/subsets/
//TC: O(2 ^ N)
//Recursion Space : O(N)

class Solution {
    
    public List<List<Integer>> subsets(int[] nums,int idx) {
        
        if(idx == nums.length) {
            List<List<Integer>> res = new ArrayList<>();
            res.add(new ArrayList<>());
            return res;
        }
        
        List<List<Integer>> smallAns = subsets(nums,idx + 1);
        List<List<Integer>> res = new ArrayList<>();
        
        for(List<Integer> subset : smallAns) {
            res.add(subset);
            
            List<Integer> completeSubset = new ArrayList<>();
            completeSubset.add(nums[idx]);
            
            for(int val : subset) {
                completeSubset.add(val);
            }
            
            res.add(completeSubset);
        }
        
        return res;
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        return subsets(nums,0);
    }
}
