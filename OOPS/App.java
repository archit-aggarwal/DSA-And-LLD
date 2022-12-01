public class App {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setGender('M');
        s1.setMarks(70, "1234jaijai");
        s1.setMarks(75, "12345678");
        s1.setName("Archit");
        s1.setRollNo(10);

        System.out.println(s1.getGender());
        System.out.println(s1.getMarks());
        System.out.println(s1.getName());
        System.out.println(s1.getRollNo());

    }
}
