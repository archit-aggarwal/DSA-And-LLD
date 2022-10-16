import java.io.File;
import java.io.FileInputStream;
import java.util.*;

class Solution {
    public static void calculator() {
        System.out.println("Starting Normally");
        try {
            System.out.println("Inside Try Block Before Input");
            Scanner scn = new Scanner(System.in);
            int a = scn.nextInt();
            int b = scn.nextInt();
            char op = scn.next().charAt(0);
            System.out.println("Inside Try Block After Input");

            switch (op) {
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

                    System.out.println("Inside Swith Case Before Division");
                    System.out.println(a / b);
                    System.out.println("Inside Swith Case After Division");
                    break;
                }
                default: {
                    System.out.println("Invalid Operator");
                }
            }

            System.out.println("Inside Try After Switch Case");
        } catch (Exception e) {
            System.out.println("Inside Catch");
            System.out.println(e);
        }

        // String str = null;
        // System.out.println(str.charAt(0));

        System.out.println("Terminating Normally");
    }

    public static void checkedException() {
        // FileInputStream fs = new
        // FileInputStream("architaggarwal/Archits-MacBook-Air/System-Design/Solution.java");

        try {
            FileInputStream scn = new FileInputStream("d:/abc.txt");
        } catch (Exception e) {
            System.out.println("Exception Occured: " + e);
        }
    }

    public static void multipleCatch(String[] args) {
        try {
            Integer a = Integer.parseInt(args[0]);
            Integer b = Integer.parseInt(args[1]);
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Division by Zero Not Allowed");
        } catch (NumberFormatException e) {
            System.out.println("Please pass integers only");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please pass atleast 2 parameters");
        } catch (Exception e) {
            System.out.println("Some Other Expection Occured");
        }
    }

    public static void finallyDemo() {
        Scanner scn = new Scanner(System.in);
        try {
            int a = scn.nextInt();
            int b = scn.nextInt();
            System.out.println(a / b);

        } catch (Exception e) {
            System.out.println("Exception Occured: " + e);
        } finally {
            System.out.println("Finally Block Executed: Clean up Code");
            scn.close();
        }
    }

    public static void main(String[] args) {
    }
}
