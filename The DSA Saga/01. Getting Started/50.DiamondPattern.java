// https://www.codingninjas.com/codestudio/problems/diamond-of-stars_893297?leftPanelTab=0
class Solution {

    public static void printPattern(int n) {
        int spaces = n / 2, stars = 1;

        for (int row = 1; row <= n; row++) {
            for (int count = 1; count <= spaces; count++) {
                System.out.print(" ");
            }
            for (int count = 1; count <= stars; count++) {
                System.out.print("*");
            }
            System.out.println();

            if (row <= n / 2) {
                stars += 2;
                spaces--;
            } else {
                stars -= 2;
                spaces++;
            }
        }
    }
}