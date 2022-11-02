class Parent {
    private int a, b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    // overriden method
    public void printObject(int a, int b) {
        System.out.println("Parent's Object : ");
        this.setA(a);
        this.setB(b);
        System.out.println(this.getA() + " " + this.getB());
    }
}

class Child extends Parent {
    private int p, q;

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    // overrided method
    public void printObject(int p, int q) {
        System.out.println("Child Object : ");
        this.setP(p);
        this.setQ(q);
        System.out.println(super.getA() + " " + super.getB());
        System.out.println(this.getP() + " " + this.getQ());
    }
}

class User {
    String name;
    String location;

    public User(String name, String location) {
        this.name = name;
        this.location = location;
    }

    // overriden method
    public void bookShow() {
        System.out.println(this.name + " " + this.location);
        System.out.println("Error: You cannot book the show");
        System.out.println("Please, first login or sign up");
    }
}

class RegisteredUser extends User {
    String emailId;
    long phoneNo;

    public RegisteredUser(String name, String location, String emailId, long phoneNo) {
        super(name, location);
        this.emailId = emailId;
        this.phoneNo = phoneNo;
    }

    // overrided method
    public void bookShow() {
        System.out.println(super.name + " " + super.location + " " + this.emailId + " " + this.phoneNo);
        System.out.println("Please select the number of seats");
        System.out.println(" And proceed to payment gateway");
    }
}

class Driver {
    public static void main(String[] args) {
        // Parent obj1 = new Parent();
        // obj1.printObject(10, 20);
        // // overrident method -> Parent

        // Child obj2 = new Child();
        // obj2.printObject(40, 50);
        // // overrided method -> Child

        User u1 = new User("Archit", "Delhi");
        u1.bookShow();

        RegisteredUser u2 = new RegisteredUser("Archit", "Delhi", "archit@gmail.com", 9319117889l);
        u2.bookShow();
    }
}