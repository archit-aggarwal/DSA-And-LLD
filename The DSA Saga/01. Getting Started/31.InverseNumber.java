// https://www.pepcoding.com/resources/online-java-foundation/getting-started/inverse_of_number/topic

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int inv = 0, place = 1;

        while (n > 0) {
            int digit = n % 10;
            inv = inv + (place * (int) Math.pow(10, digit - 1));
            n = n / 10;
            place++;
        }

        System.out.println(inv);
    }
}