public class App {
    public static void main(String[] args) {
        Student1 s1 = new Student1();

        s1.marks = 20;
        s1.gender = 'M';
        s1.rollNo = 10;
        s1.name = "Archit";

        s1.study();
        s1.play("Cricket");
        boolean res = s1.getResult();
        System.out.println(res);

        s1.setRollNo(12);
        System.out.println(s1.rollNo);

        // for (String arg : args) {
        // System.out.println(arg);
        // }
    }
}
