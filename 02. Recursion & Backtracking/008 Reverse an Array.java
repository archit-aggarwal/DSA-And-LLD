//Link : https://practice.geeksforgeeks.org/problems/reverse-an-array/0
//TC : O(N)
//Recursion Space: O(N)

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
    public static void reverse(int[] arr, int lo, int hi) {
        
        if(lo >= hi) return;
        
        //swap yourself
        int temp = arr[lo];
        arr[lo] = arr[hi];
        arr[hi] = temp;
        
        reverse(arr,lo+1,hi-1);
    }
    
    public static void display(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
    }
    
	public static void main (String[] args) {
		//code
		
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		
		while(t-- > 0) {
		    int n = scn.nextInt();
		    int[] arr = new int[n];
		    
		    for(int i=0;i<n;i++) {
		        arr[i] = scn.nextInt();
		    }
		    
		    reverse(arr,0,arr.length - 1);
		    display(arr);
		}
	}
}
