package Day09;
public class _52PrintAlphabetsIII {
    public static void main(String[] args) {
        // Approach 1
        // for (char ch = 'a'; ch <= 'z'; ch++) {
        // if (ch % 2 == 1)
        // System.out.println(ch);
        // else
        // System.out.println((char) (ch - 32));
        // }

        // Approach 2
        for (char ch = 'a'; ch <= 'z'; ch += 2) {
            System.out.println(ch);
            System.out.println((char) (ch - 31));
        }
    }
}