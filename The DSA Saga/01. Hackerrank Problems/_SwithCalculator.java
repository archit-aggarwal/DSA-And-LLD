package Day07;

import java.util.*;

public class _SwithCalculator {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = scn.nextInt();
        int b = scn.nextInt();

        switch (n) {
            case 10: {
                System.out.println(a + b);
                break;
            }
            case 20: {
                System.out.println(a - b);
                break;
            }
            case 30: {
                System.out.println(a * b);
                break;
            }
            case 40: {
                System.out.println(a % b);
                break;
            }
            case 50: {
                System.out.println(a / b);
                break;
            }
            default: {
                System.out.println("Enter a valid number");
            }
        }
    }
}
