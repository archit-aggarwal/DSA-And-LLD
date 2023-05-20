import java.util.*;

class Solution56 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (true) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            char operator = scn.next().charAt(0);

            switch (operator) {
                case '+': {
                    System.out.println(a + b);
                    break;
                }
                case '-': {
                    System.out.println(a - b);
                    break;
                }
                case '*': {
                    System.out.println(a * b);
                    break;
                }
                case '/': {
                    System.out.println(a / b);
                    break;
                }
                default: {
                    System.out.println("Invalid Input");
                    break;
                }
            }
            scn.close();
        }
    }
}
