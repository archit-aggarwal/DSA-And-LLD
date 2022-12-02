public class App {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setDefaultProperties(3);

        // s1.setGender('M');
        // s1.setMarks(70, "1234jaijai");
        // s1.setMarks(75, "12345678");
        // s1.setName("Archit");
        // s1.setRollNo(10);

        System.out.println(s1.getGender());
        System.out.println(s1.getMarks());
        System.out.println(s1.getName());
        System.out.println(s1.getRollNo());

        s1.subjects[0] = "C++";
        s1.subjects[1] = "Java";
        s1.subjects[2] = "Python";

        for (String s : s1.subjects) {
            System.out.print(s + " ");
        }
    }
}
