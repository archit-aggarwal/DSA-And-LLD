class Concept2 {
    public static void swap1(Student x, Student y) {
        Student z = x;
        x = y;
        y = z;
    }

    public static void swap2(Student x, Student y) {
        Student z = new Student();
        z.marks = x.marks;
        z.gender = x.gender;

        x = y;
        y = z;
    }

    public static void swap3(Student x, Student y) {
        Student z = x;

        x.marks = y.marks;
        x.gender = y.gender;

        y.marks = z.marks;
        y.gender = z.gender;
    }

    public static void swap4(Student x, Student y) {
        Student z = new Student();
        z.marks = x.marks;
        z.gender = x.gender;

        x.marks = y.marks;
        x.gender = y.gender;

        y.marks = z.marks;
        y.gender = z.gender;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.marks = 100;
        s1.gender = 'M';

        Student s2 = new Student();
        s2.marks = 75;
        s2.gender = 'F';

        System.out.println(s1.marks + ", " + s1.gender);
        System.out.println(s2.marks + ", " + s2.gender);

        // swap1(s1, s2);
        // swap2(s1, s2);
        // swap3(s1, s2);
        swap4(s1, s2);

        System.out.println(s1.marks + ", " + s1.gender);
        System.out.println(s2.marks + ", " + s2.gender);
    }
}
