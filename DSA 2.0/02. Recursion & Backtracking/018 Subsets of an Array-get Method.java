//Link : https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/subsets-of-array-official/ojquestion
//TC: O(2^N)
//recursion Space: O(N) height of the recursion tree
import java.io.*;
import java.util.*;

public class Main{

public static ArrayList<String> subsets(int[] arr, int idx) {
    
    if(idx == arr.length) {
        ArrayList<String> baseRes = new ArrayList<>();
        baseRes.add("");
        return baseRes;
    }
    
    ArrayList<String> smallAns = subsets(arr,idx + 1);
    ArrayList<String> res = new ArrayList<>();
    
    //no call
    for(String str : smallAns) {
        str = "-	" + str;
        res.add(str);
    }
    
    //yes call
    for(String str : smallAns) {
        str = arr[idx] + "	" + str;
        res.add(str);
    }
    
    return res;
}

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    
    for(int i=0;i<n;i++) {
        arr[i] = scn.nextInt(); 
    }
    
    ArrayList<String> ans = subsets(arr,0);
    for(String str : ans) {
        System.out.println(str);
    }
 }

}
