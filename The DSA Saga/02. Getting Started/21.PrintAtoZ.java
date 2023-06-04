// https://www.geeksforgeeks.org/program-to-print-alphabets-from-a-to-z-using-loop/

// Time: O(1) - Space O(1)

class Solution {
    public static void main(String[] args) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch);
        }

        // OR
        for (int idx = 0; idx < 26; idx++) {
            char ch = (char) (idx + 'a');
            System.out.println(ch);
        }
    }
}