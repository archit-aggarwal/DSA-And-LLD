class User {
    String name, address;

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

    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void bookShow() {
        System.out.println("You can't book show. Please register first");
    }
}

class RegisteredUser extends User {
    String phoneNo, emailId, address;

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAddress() {
        System.out.println(super.address);
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public RegisteredUser(String name, String address, String phoneNo, String emailId) {
        super(name, "Delhi");
        this.phoneNo = phoneNo;
        this.emailId = emailId;
        this.address = address;
    }

    public void bookShow() {
        System.out.println("You can book the show, please proceed to payments");
    }
}

class Driver {
    public static void main(String[] args) {
        // User u1 = new User("Archit", "Delhi");

        // System.out.println(u1.getName() + " " + u1.getAddress());

        // u1.bookShow();

        // System.out.println(u1.name + " " + u1.address);

        // RegisteredUser u2 = new RegisteredUser("Archit", "Delhi 110085",
        // "9319117889", "archit.aggarwal023@gmail.com");

        // System.out.println(u2.name + ", " + u2.emailId + ", " + u2.phoneNo);

        // u2.bookShow(); // overriding

        // System.out.println(u2.address);
        // System.out.println(u2.getAddress());

        User u3 = new RegisteredUser("Archit", "Delhi 110085", "9319117889", "archit.aggarwal023@gmail.com");

        System.out.println(u3.name);
        System.out.println(u3.address);
        u3.bookShow(); // overrided

        // System.out.println(u3.getAddress());
    }
}

