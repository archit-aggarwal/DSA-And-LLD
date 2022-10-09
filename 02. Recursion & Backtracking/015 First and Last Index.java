//Link https://practice.geeksforgeeks.org/problems/find-index4752/1
//TC : O(N)
//Recursion Space : O(N)

class Solution
{ 
    
    static int firstIndex(int[] arr, int idx, int target) {
        
        if(idx == arr.length) return -1;
        
        if(arr[idx] == target) return idx;
        
        return firstIndex(arr,idx + 1,target);
    }
    
    static int lastIndex(int[] arr, int idx, int target) {
        
        if(idx == -1) return -1;
        
        if(arr[idx] == target) return idx;
        
        return lastIndex(arr,idx -1,target);
    }
    
    // Function to find starting and end index 
    static int[] findIndex(int arr[], int N, int key) 
    { 
        //code here.
        int[] res = new int[2];
        res[0] = firstIndex(arr,0,key);
        res[1] = lastIndex(arr,N-1,key);
        return res;
    }
}
