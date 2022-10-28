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

    public void viewShow() {
        System.out.println("I can view listing shows on app");
    }
}

class RegisteredUser extends User {
    String emailId;
    long phoneNo;

    public RegisteredUser() {
        // super();
        this.emailId = "registeredUser@gmail.com";
        this.phoneNo = 9319117888l;
        System.out.println("Registered User Created");
    }

    public RegisteredUser(String emailId, long phoneNo) {
        // super();
        // this.emailId = emailId;
        // this.phoneNo = phoneNo;
        this("Anonymous", "India", emailId, phoneNo);
    }

    public RegisteredUser(String name, String location, String emailId, long phoneNo) {
        super(name, location); // it must be the first line
        this.emailId = emailId;
        this.phoneNo = phoneNo;
    }

    public void bookShow() {
        // super(); Not accessible 
        System.out.println("I can book the shows on app");
    }
}

class Driver {
    public static void main(String[] args) {
        User user1 = new User();
        System.out.println(user1.name);
        System.out.println(user1.location);
        user1.viewShow();

        RegisteredUser user2 = new RegisteredUser();
        System.out.println(user2.name);
        System.out.println(user2.location);
        user2.viewShow();

        System.out.println(user2.emailId);
        System.out.println(user2.phoneNo);
        user2.bookShow();

        RegisteredUser user3 = new RegisteredUser("archit.aggarwal@gmail.com", 9319117889l);
        System.out.println(user3.name);
        System.out.println(user3.location);
        System.out.println(user3.emailId);
        System.out.println(user3.phoneNo);

        RegisteredUser user4 = new RegisteredUser("archit", "Delhi", "archit@gmail.com", 9319117889l);
        System.out.println(user4.name);
        System.out.println(user4.location);
        System.out.println(user4.emailId);
        System.out.println(user4.phoneNo);

    }
}