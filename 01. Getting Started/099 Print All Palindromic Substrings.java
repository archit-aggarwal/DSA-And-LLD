//Link https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/print-all-palindromic-substrings-official/ojquestion
//Time Complexity : O(n*n*n)
//Extra Space : O(1)

import java.io.*;
import java.util.*;

public class Main {

    public static boolean isPalindrome(String str) {
        int lo = 0;
        int hi = str.length()-1;
        
        while(lo < hi) {
            if(str.charAt(lo) != str.charAt(hi))
            return false;
            lo++;
            hi--;
        }
        
        return true;
    }

	public static void solution(String str){
		//write your code here
		
		for(int i=0;i<str.length();i++) {
		    for(int j=i;j<str.length();j++) {
		        String subStr = str.substring(i,j+1);
		        if(isPalindrome(subStr)) {
		            System.out.println(subStr);
		        }
		    }
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
