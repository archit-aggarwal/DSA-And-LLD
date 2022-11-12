class User {
    String name;
    String location;

    public User() {
        this.name = "Anonymous";
        this.location = "India";
        System.out.println("Guest User Created");
    }

    public User(String name, String location) {
        this.name = name;
        this.location = location;
    }
}

class RegisteredUser extends User {
    String emailId;
    long phoneNo;

    public RegisteredUser() {
        this.emailId = "registeredUser@gmail.com";
        this.phoneNo = 9319117888l;
        System.out.println("Registered User Created");
    }

    public RegisteredUser(String emailId, long phoneNo) {
        this("Anonymous", "India", emailId, phoneNo);
    }

    public RegisteredUser(String name, String location, String emailId, long phoneNo) {
        super(name, location); // it must be the first line
        this.emailId = emailId;
        this.phoneNo = phoneNo;
    }
}

class Driver {
    public static void main(String[] args) {
        RegisteredUser u1 = new RegisteredUser("archit", "delhi", "archit@gmail.com", 9319117888l);
        System.out.println(u1.name + " " + u1.emailId);

        // Child: Ref & Object

        User u2 = new User(); // Parent : Ref & Object
        System.out.println(u2.name);

        User u3 = new RegisteredUser(); // Parent Ref, Child Object
        System.out.println(u3.name + ((RegisteredUser) u3).emailId);

        // RegisteredUser u4 = new User(); child ref parent object not allowed

        RegisteredUser u5 = u1; // shallow copy
        System.out.println(u5.name + " " + u5.emailId);

        // RegisteredUser u6 = u3; // Compilation Error: No Typecasting
        if (u3 instanceof RegisteredUser) {
            RegisteredUser u6 = (RegisteredUser) u3;
            System.out.println(u6.name + u6.emailId);
        } else {
            System.out.println("This user is not registered");
        }

        // RegisteredUser u7 = u2; // Compilation Error
        // RegisteredUser u7 = (RegisteredUser) u2;
        // Runtime Error: Classcast Exception

        if (u2 instanceof RegisteredUser) {
            RegisteredUser u7 = (RegisteredUser) u2;
            System.out.println(u7.emailId);
        } else {
            System.out.println("This user is not registered");
        }
    }
}