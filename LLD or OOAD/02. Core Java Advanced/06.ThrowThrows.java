import java.util.*;
import java.io.*;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

class Driver1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Scanner scn = new Scanner(System.in);
        int a = 0, b = 0;
        try {
            a = scn.nextInt();
            b = scn.nextInt();

            try {
                int res = calc.divide(a, b);
                System.out.println(res);
            } catch (ArithmeticException e) {
                ExceptionHandling.calculatorException();
            }

        } catch (Exception e) {
            ExceptionHandling.inputOutputException();
        }

    }
}

class ExceptionHandling {
    public static void inputOutputException() {
        System.out.println("Please Provide Input Again");
    }

    public static void calculatorException() {
        System.out.println("Division by 0 Not Allowed");
    }
}

class FileInputOutput {
    public static void fileRead(String path) throws FileNotFoundException {
        // Checked / Compile Time Exception
        FileInputStream file = new FileInputStream(path);
        fileWrite(file);
    }

    public static void fileWrite(FileInputStream file) {
        System.out.println("Performs Some Task on the File");
    }
}

class Driver2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String path = scn.nextLine();

        try {
            FileInputOutput.fileRead(path);
        } catch (FileNotFoundException e) {
            System.out.println("Wrong Path Passed");
        }
    }
}

// Custom Exception: Unchecked
class AgeInvalidException extends RuntimeException {
    public AgeInvalidException() {
        super("Age Is Invalid");
    }

    public AgeInvalidException(String message) {
        super(message);
    }
}

class VotingApp {
    public static void vote(int age) {
        if (age < 18)
            throw new AgeInvalidException();

        System.out.println("Voted Successfully");
    }
}

class Driver3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();

        try {
            VotingApp.vote(age);
        } catch (AgeInvalidException e) {
            System.out.println(e);
        }
    }

}
