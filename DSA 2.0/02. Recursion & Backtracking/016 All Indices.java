//Link : https://pepcoding.com/resources/online-java-foundation/recursion-in-arrays/all-indices-official/ojquestion
//TC: O(N)
//Recursion Space: O(N)
//Output Space : O(N) worst case

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        // write ur code here
        
        if(idx == arr.length) {
            int[] res = new int[fsf];
            return res;
        }
        
        if(arr[idx] == x) {
            int[] res = allIndices(arr,x,idx + 1,fsf + 1);
            res[fsf] = idx;
            return res;
        } else {
            int[] res = allIndices(arr,x,idx + 1,fsf);
            return res;
        }
    }
    

}
