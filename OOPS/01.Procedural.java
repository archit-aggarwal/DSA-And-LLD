class Concept1 {
    public static void fun(Student s) {
        System.out.println(s.marks);
        s.marks = 99;
        System.out.println(s.marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        // Set the properties
        s1.name = "Archit";
        s1.rollNo = 1;
        s1.gender = 'M';
        s1.marks = 100;

        // Get the properites
        // System.out.println(s1.name);
        // System.out.println(s1.rollNo);
        // System.out.println(s1.gender);
        System.out.println(s1.marks);

        fun(s1);

        System.out.println(s1.marks);

        // Student s2 = new Student();

        // s2.name = "Babita";
        // s2.rollNo = 2;
        // s2.gender = 'F';
        // s2.marks = 30;

        // System.out.println(s2.name);
        // System.out.println(s2.rollNo);
        // System.out.println(s2.gender);
        // System.out.println(s2.marks);

        // Student[] arr = new Student[3];

        // arr[0] = s1;
        // arr[1] = s2;

        // arr[2] = new Student();
        // arr[2].name = "Chetan";
        // arr[2].rollNo = 3;
        // arr[2].gender = 'M';
        // arr[2].marks = 95;

        // System.out.println(arr[2].name);
        // System.out.println(arr[2].rollNo);
        // System.out.println(arr[2].gender);
        // System.out.println(arr[2].marks);
    }
}
