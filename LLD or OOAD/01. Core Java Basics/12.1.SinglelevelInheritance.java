class User {
    String name;
    String location;

    public User(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public User() {
        this.name = "Anonymous";
        this.location = "India";
    }

    public void viewShow() {
        System.out.println("I can view listing shows on app");
    }
}

class RegisteredUser extends User {
    String emailId;
    long phoneNo;

    public RegisteredUser() {
        this.emailId = "registeredUser@gmail.com";
        this.phoneNo = 9319117888l;
    }

    public RegisteredUser(String emailId, long phoneNo) {
        this.emailId = emailId;
        this.phoneNo = phoneNo;
    }

    public void bookShow() {
        System.out.println("I can book the shows on app");
    }
}

class Solution {
    public static void main(String[] args) {
        User obj1 = new User();
        obj1.name = "Archit Aggarwal";
        obj1.location = "Delhi";
        System.out.println(obj1.name + " " + obj1.location);
        obj1.viewShow();

        // Compilation Error
        // System.out.println(obj1.phoneNo);
        // System.out.println(obj1.emailId);
        // obj1.bookShow();

        RegisteredUser obj2 = new RegisteredUser();
        obj2.name = "Shahrukh Khan";
        obj2.location = "Mumbai";
        obj2.phoneNo = 9319117889l;
        obj2.emailId = "archit.aggarwal023@gmail.com";

        System.out.println(obj2.name + " " + obj2.location);
        System.out.println(obj2.phoneNo + " " + obj2.emailId);

        obj2.viewShow();
        obj2.bookShow();
    }
}
