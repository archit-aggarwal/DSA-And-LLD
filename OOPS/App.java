public class App {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getGender());
        System.out.println(s1.getMarks());
        System.out.println(s1.getName());
        System.out.println(s1.getRollNo());

        Student s2 = new Student(5, "Archit", 75.5, 'M');
        System.out.println(s2.getGender());
        System.out.println(s2.getMarks());
        System.out.println(s2.getName());
        System.out.println(s2.getRollNo());
    }
}
