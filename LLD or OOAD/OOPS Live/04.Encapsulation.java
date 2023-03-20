public class Student {
    // Properties: Private: Security
    private int rollNo;
    private String name;
    private double marks;
    private char gender;
    String[] subjects;

    public void setDefaultProperties(int n) {
        rollNo = 1;
        name = "Anonymous";
        marks = 100.0;
        gender = 'N';
        subjects = new String[n];
    }

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

    public void setMarks(double newMarks, String password) {
        if (password.equals("1234jaijai") == true)
            marks = newMarks;
    }

    public void setGender(char newGender) {
        gender = newGender;
    }

    public void setName(String newName) {
        name = newName;
    }

}
