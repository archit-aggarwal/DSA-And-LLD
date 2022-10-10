//Link : https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/subsets-of-array-official/ojquestion
//TC : O(2^N)
//Recursion Space : O(N)

import java.io.*;
import java.util.*;

public class Main{

public static void subsets(int[] arr,int idx,String asf) {
    if(idx == arr.length) {
        System.out.println(asf);
        return;
    }
    
    //no
    subsets(arr,idx + 1,asf + "-\t");
    
    //yes
    subsets(arr,idx + 1,asf + arr[idx] + "\t");
}

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    
    for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt();
    }
    
    subsets(arr,0,"");
 }

}
