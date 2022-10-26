class GuestUser {
    private String name;
    private String address;

    public GuestUser(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void bookShow() {
        System.out.println("You can only view shows. For Booking, first Register");
    }
}

class RegisteredUser extends GuestUser {
    private String phoneNo;
    private String emailID;
    private String address;

    public RegisteredUser(String name, String address, String phoneNo, String emailID) {
        super(name, "India");
        this.phoneNo = phoneNo;
        this.emailID = emailID;
        this.address = address + " @ " + super.getAddress();
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void bookShow() {
        System.out.println("You are authotized to book. Proceed to seats selection");
    }
}

class Solution {
    public static void parentReferenceObject() {
        GuestUser user = new GuestUser("Archit Aggarwal", "India");

        System.out.println(user.getName() + " : " + user.getAddress());
        // Possible: Guest User have name & Address fields and methods

        // System.out.println(user.getPhoneNo() + " " + user.getEmailID());
        // Not Possible: GuestUser does not have PhoneNo & EmailID fields or methods

        user.bookShow();
        // Parent's Book Show
    }

    public static void childReferenceObject() {
        RegisteredUser user = new RegisteredUser("Archit Aggarwal",
                "Delhi", "9319117888", "archit.aggarwal023@gmail.com");

        System.out.println(user.getName() + " : " + user.getAddress());
        // Possible: Registered User have name & Address fields and methods

        System.out.println(user.getPhoneNo() + " " + user.getEmailID());
        // Possible: Registered User also have phoneNo & Email ID fields and methods

        user.bookShow();
        // Child's Book Show (overrided definition)
    }

    public static void polymorphicVariable() {
        GuestUser user = new RegisteredUser("Archit Aggarwal",
                "Delhi", "9319117888", "archit.aggarwal023@gmail.com");

        System.out.println(user.getName() + " : " + user.getAddress());
        // Possible: Registered User have name & Address fields and methods

        // System.out.println(user.getPhoneNo() + " " + user.getEmailID());
        // Not Possible: GuestUser does not have PhoneNo & EmailID fields or methods

        user.bookShow();
        // Child's Book Show (overrided definition)
    }

    public static void main(String[] args) {
        parentReferenceObject();
        System.out.println();

        childReferenceObject();
        System.out.println();

        polymorphicVariable();
        System.out.println();
    }
}