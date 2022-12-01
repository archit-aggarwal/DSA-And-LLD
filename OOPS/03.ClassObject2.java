public class Student1 {
    int rollNo;
    String name;
    double marks;
    char gender;

    public void study() {
        System.out.println("Student is Studying");
    }

    public void play(String sports) {
        System.out.println("Student is Playing " + sports);
    }

    public boolean getResult() {
        if (marks >= 33)
            return true;
        return false;
    }

    public void setRollNo(int newRollNo) {
        rollNo = newRollNo;
    }
}
