public class App {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNo(5);
        s1.setMarks(85);
        s1.setName("Archit");
        s1.setGender('M');

        System.out.println(s1.subjects);
        s1.subjects.add("Java");
        s1.subjects.add("Javascript");
        System.out.println(s1.subjects);

        Student s2 = new Student(s1);
        // s2.setRollNo(s1.getRollNo());

        System.out.println(s2.getRollNo());
        System.out.println(s2.getMarks());
        System.out.println(s2.getName());
        System.out.println(s2.getGender());

    }
}
