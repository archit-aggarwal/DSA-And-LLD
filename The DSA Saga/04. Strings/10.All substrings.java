// https://www.codingninjas.com/codestudio/problems/all-substrings_1262347

// Time Complexity: O(N^3) Space Complexity: O(1)

class Solution {
	
	// Approach 1:

    static void printSubstrings(String str) {
        for(int start = 0; start < str.length(); start++){
        	for(int end = start; end < str.length(); end++){
        		for(int idx = start; idx <= end; idx++){
        			System.out.print(str.charAt(idx));
        		}
        		System.out.println();
        	}
        }
    }

    // Approach 2: In-built function

    static void printSubstrings2(String str) {
        for(int start = 0; start < str.length(); start++){
        	for(int end = start; end < str.length(); end++){
        		System.out.println(str.substring(start, end + 1));
        	}
        }
    }
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printSubstrings(input);
	}
}
