//Link : https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1
//TC: O(N)
//Recursion Space: O(N)

class Solution {
    
    boolean isSorted(int[] arr, int idx) {
        
        if(idx == arr.length -1) return true;
        
        if(arr[idx] > arr[idx + 1]) return false;
        
        return isSorted(arr,idx + 1);
        
    }
    
    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        return isSorted(arr,0);
    }
}
