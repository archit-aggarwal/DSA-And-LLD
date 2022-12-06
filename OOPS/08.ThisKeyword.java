import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rollNo = scn.nextInt();
        String name = scn.next();
        double marks = scn.nextDouble();
        char gender = scn.next().charAt(0);

        Student s1 = new Student(rollNo, name, marks, gender);

        // System.out.println(s1.getGender());
        // System.out.println(s1.getMarks());
        // System.out.println(s1.getRollNo());
        // System.out.println(s1.getName());

        s1.printResult();
    }
}
