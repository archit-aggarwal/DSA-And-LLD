package Day09;

public class _51PrintAlphabetsII {
    public static void main(String[] args) {
        // Approach 1
        // for (char ch = 'a'; ch <= 'z'; ch++) {
        // if (ch % 2 == 1)
        // System.out.println(ch);
        // }

        // Approach 2
        // O(1) Constant
        for (char ch = 'a'; ch <= 'z'; ch += 2) {
            System.out.println(ch);
        }
    }
}
