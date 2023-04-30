// https://www.codingninjas.com/codestudio/problems/give-me-triangle_893275
class Solution {
    public static void ninjaPuzzle(int n) {
        // Approach 1: Grid Based Approach
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col >= row)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Approach 2: Stars & Spaces Approach
        int stars = n, spaces = 0;
        for (int row = 1; row <= n; row++) {
            for (int count = 1; count <= spaces; count++) {
                System.out.print(" ");
            }
            for (int count = 1; count <= stars; count++) {
                System.out.print("*");
            }

            System.out.println();
            stars--;
            spaces++;
        }
    }
}