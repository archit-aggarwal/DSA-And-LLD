import java.util.*;

class Solution60 {
    public static void swap(int a, int b) {
        System.out.println("Inside Swap: Before Swap: " + a + " " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside Swap: After Swap: " + a + " " + b);
    }

    public static void main(String[] args) {
        int a = 7, b = 12;
        System.out.println("Inside Main: Before Swap: " + a + " " + b);
        swap(a, b);
        System.out.println("Inside Main: After Swap: " + a + " " + b);
    }
}