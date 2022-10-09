//Link: https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/subsets-of-array-official/ojquestion
//TC: O(2 ^ N)

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    
    for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt(); 
    }
    
    int noOfSubsets = (int)(Math.pow(2,n));
    
    for(int i=0;i<noOfSubsets;i++) {
        
        int temp = i;
        String subset = "";
        
        for(int j=n-1;j>=0;j--) {
            int rem = temp % 2;
            temp /= 2;
            
            if(rem == 0) {
                subset = "-	" + subset;
            } else {
                subset = arr[j] + "	" + subset;
            }
        }
        
        System.out.println(subset);
    }
    
 }

}
