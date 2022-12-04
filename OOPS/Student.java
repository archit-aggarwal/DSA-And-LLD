public class Student {
    private int rollNo;
    private String name;
    private double marks;
    private char gender;

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

    public Student(Student other) {
        // rollNo = other.rollNo;
        rollNo = other.getRollNo();
    }
}
