class Sum {
    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    // Number of Arguments
    public void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    // Datatypes of Arguments
    public void sum(String a, String b) {
        System.out.println(a + b);
    }

    public void sum(String a, int b) {
        System.out.println(a + b);
    }

    // Order of Arguments
    public void sum(int a, String b) {
        System.out.println(a + b);
    }

    // Compilation Error: Variable names
    // does not matter
    // public void sum(int c, int d){
    // }

    // Compilation Error: Return type does
    // not matter
    // public int sum(int a, int b){
    // return a + b;
    // }
}

class User {
    String name;

    public void setName(String firstName, String middleName, String lastName) {
        name = firstName + " " + middleName + " " + lastName;
    }

    public void setName(String firstName, String lastName) {
        name = firstName + " " + lastName;
    }

    public void setName(String firstName) {
        name = firstName;
    }

    public void setName(char firstLetter, char secondLetter, String lastName) {
        name = firstLetter + ". " + secondLetter + ". " + lastName;
    }
}

class Driver {
    public static void main(String[] args) {
        Sum obj = new Sum();
        obj.sum(10, 15);
        obj.sum(5, 10, 15);
        obj.sum("Archit", "Aggarwal");
        obj.sum("Archit's score: ", 100);
        obj.sum(100, " is Archit's score");

        User u1 = new User();
        u1.setName("Sachin", "Ramesh", "Tendulkar");
        System.out.println(u1.name);

        User u2 = new User();
        u2.setName("Virat", "Kohli");
        System.out.println(u2.name);

        User u3 = new User();
        u3.setName("Tejas");
        System.out.println(u3.name);

        User u4 = new User();
        u4.setName('K', 'L', "Rahul");
        System.out.println(u4.name);

    }
}