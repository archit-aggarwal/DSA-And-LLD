import java.util.*;

public class Student {
    private int rollNo;
    private String name;
    private double marks;
    private char gender;
    ArrayList<String> subjects = new ArrayList<>();

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

    // Copy Constructor
    public Student(Student other) {
        rollNo = other.rollNo;
        marks = other.marks;
        name = other.name;
        gender = other.gender;
    }

    public Student() {
        rollNo = 1;
        marks = 100;
        name = "Anonymous";
        gender = 'N';
    }
}
