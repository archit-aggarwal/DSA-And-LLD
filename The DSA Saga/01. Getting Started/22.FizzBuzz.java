// https://www.hackerrank.com/challenges/fizzbuzz/problem

// Time: O(1) - Space O(1)

class Solution {
    public static void main(String[] args) {
        int fizz = 0, buzz = 0;
        for (int idx = 1; idx <= 100; idx++) {
            fizz++;
            buzz++;
            if (fizz == 3 && buzz == 5) {
                System.out.println("FizzBuzz");
                fizz = buzz = 0;
            } else if (fizz == 3) {
                System.out.println("Fizz");
                fizz = 0;
            } else if (buzz == 5) {
                System.out.println("Buzz");
                buzz = 0;
            } else {
                System.out.println(idx);
            }
        }
    }
}