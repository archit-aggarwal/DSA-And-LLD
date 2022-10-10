/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    public static void reverse(int[] arr,int lo, int hi) {
        while(lo < hi) {
            int temp = arr[lo];
            arr[lo] = arr[hi];
            arr[hi] = temp;
            lo++;
            hi--;
        }
    }
    
    public static void rotate(int[] arr, int k) {
        
        int n = arr.length;
        
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
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
		    int k = scn.nextInt();
		    
		    int[] arr = new int[n];
		    
		    for(int i=0;i<n;i++) {
		        arr[i] = scn.nextInt();
		    }
		    
		    rotate(arr,k);
		    display(arr);
		}
	}
}
