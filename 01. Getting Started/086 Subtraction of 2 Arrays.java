import java.io.*;
import java.util.*;

public class Main{
    
public static int[] diff(int[] arr1,int[] arr2) {
    int[] res = new int[arr2.length]; //size of the larger array
    int i = arr1.length-1, j = arr2.length -1, k = res.length-1;
    
    int bo = 0;
    
    while(j >= 0) {
        int d1 = (i >= 0) ? arr1[i] : 0;
        int d2 = arr2[j];
        
        if(d2 - d1 + bo < 0) {
            res[k] = d2 - d1 + bo + 10;
            bo = -1;
        } else {
            res[k] = d2 - d1 + bo;
            bo = 0;
        }
        
        i--;j--;k--;
    }
    
    return res; 
}    

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1 = scn.nextInt();
    
    int[] arr1 = new int[n1];
    
    for(int i=0;i<n1;i++) {
        arr1[i] = scn.nextInt();
    }
    
    int n2 = scn.nextInt();
    
    int[] arr2 = new int[n2];
    
    for(int i=0;i<n2;i++) {
        arr2[i] = scn.nextInt();
    }
    
    //differnce
    int[] res = diff(arr1,arr2);
    
    int idx = 0;
    
    while(idx < res.length && res[idx] == 0) {
        idx++;
    }
    
    if(idx == res.length) {
        System.out.println("0");
    }
    
    while(idx < res.length) {
        System.out.println(res[idx]);
        idx++;
    }
    
 }

}
