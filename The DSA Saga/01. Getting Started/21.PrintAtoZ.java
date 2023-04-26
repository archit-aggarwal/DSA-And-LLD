// https://www.geeksforgeeks.org/program-to-print-alphabets-from-a-to-z-using-loop/

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