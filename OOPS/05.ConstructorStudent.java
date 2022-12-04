public class Student {
    private int rollNo;
    private String name;
    private double marks;
    private char gender;

    // Non-Parameterized or Default Explicit Constructor
    public Student() {
        rollNo = 1;
        name = "Anonymous";
        marks = 100.0;
        gender = 'N';
    }

    // Non-Parameterized or Default Implicit Empty Constructor
    // Provided by Compiler
    // public Student(){}

    // // Parameterized Constructor
    public Student(int newRollNo, String newName, double newMarks, char newGender) {
        rollNo = newRollNo;
        name = newName;
        marks = newMarks;
        gender = newGender;
    }

    // public Student(int newRollNo) {
    // rollNo = newRollNo;
    // System.out.println("Integer Constructor");
    // }

    // public Student(short newRollNo) {
    // rollNo = newRollNo;
    // System.out.println("Short Constructor");
    // }

    // public Student(int newRollNo, String newName) {
    // rollNo = newRollNo;
    // name = newName;
    // }

    // public Student(char newGender, double newMarks) {
    // marks = newMarks;
    // gender = newGender;
    // }

    // public Student(String newName, int newRollNo) {

    // }

    // public Student(int newMarks) {
    // marks = newMarks;
    // }

    // public Student(long newMarks){
    // }

    // Student(float temp) {
    // System.out.println("Float Constructor");
    // }

    // Student(long temp) {
    // System.out.println("Long Constructor");
    // }

    // Getters: Public
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public char getGender() {
        return gender;
    }

    // Setters: Public
    public void setRollNo(int newRollNo) {
        rollNo = newRollNo;
    }

    public void setMarks(double newMarks) {
        marks = newMarks;
    }

    public void setGender(char newGender) {
        gender = newGender;
    }

    public void setName(String newName) {
        name = newName;
    }
}
