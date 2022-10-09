//Link : https://leetcode.com/problems/subsets-ii/
//TC: O(2 ^ N)
//Recursion Space : O(N)

class Solution {
    
    List<List<Integer>> ans;
    
    //if prev = true -> yes call for the previous element
    //if prev = false -> no call for thr previous element
    public void subsets(int[] nums,int idx,List<Integer> curr,boolean prev) {
        
        if(idx == nums.length) {
            //deep copy
            List<Integer> copy = new ArrayList<>(curr);
            ans.add(copy);
            return;
        }
        
        //no
        subsets(nums,idx + 1,curr,false);
        
        if(idx > 0 && nums[idx] == nums[idx-1] && prev == false)
            return;
        
        //yes
        curr.add(nums[idx]);
        subsets(nums,idx + 1,curr,true);
        curr.remove(curr.size() -1); //backtracking
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans = new ArrayList<>();
        Arrays.sort(nums); // ascending order
        subsets(nums,0,new ArrayList<>(),false);
        return ans;
    }
}
