public class Student {
    private int rollNo;
    private String name;
    private double marks;
    private char gender;

    public Student(int rollNo, String name, double marks, char gender) {
        // Property = Parameter
        this.rollNo = rollNo;
        this.name = name;
        this.gender = gender;
        this.marks = marks;

        // Parameter = Parameter
        // rollNo = rollNo;
        // name = name;
        // marks = marks;
        // gender = gender;

        // System.out.println(rollNo);
        // System.out.println(name);
        // System.out.println(marks);
        // System.out.println(gender);
    }

    public Student() {

    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void printResult() {
        double marks = this.getMarks();
        if (marks < 33) {
            System.out.println("fail");
        } else {
            System.out.println("pass");
        }
    }
}
