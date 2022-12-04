public class App {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNo(5);

        Student s2 = new Student(s1);
        // System.out.println(s2.getRollNo());

        System.out.println(s1.rollNo);
    }
}
