//Link : https://leetcode.com/problems/search-a-2d-matrix/
//Approach - Binary Search
//Time complexity : O(N)
//Extra Space : O(1)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lo = 0;
        int hi = matrix.length * matrix[0].length -1;
        
        while(lo <= hi) {
            int mid = lo + (hi-lo)/2;
            
            int rIdx = mid / matrix[0].length;
            int cIdx = mid % matrix[0].length;
            
            if(matrix[rIdx][cIdx] == target) return true;
            else if(matrix[rIdx][cIdx] < target) lo = mid + 1;
            else hi = mid -1;
        }
        
        return false;
    }
}
