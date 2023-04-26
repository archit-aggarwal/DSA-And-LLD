// https://practice.geeksforgeeks.org/problems/even-odd/1

class Solution {
    public void evenOdd(int a, int b) {

        if (a % 2 == 0) {
            // a even, b odd
            System.out.println(a);
            System.out.println(b);
        } else {
            // b even, a odd
            System.out.println(b);
            System.out.println(a);
        }

    }
}