//Link : https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/0
//TC: O(N)
//Recursion Space: O(N)

class Compute {
    
    public int maximum(int[] arr,int idx) {
        
        if(idx == arr.length -1) return arr[idx];
        
        int maxOfRemArray = maximum(arr,idx + 1);
        return Math.max(arr[idx],maxOfRemArray);
    }
    
    public int largest(int arr[], int n)
    {
        return maximum(arr,0);
    }
}
