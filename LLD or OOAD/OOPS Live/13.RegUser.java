public class RegUser extends User {
    private String emailId;
    private long phoneNo;
    String address = "Delhi";

    public RegUser() {
        super(); // Parent's
        // System.out.println("Registered User Constructor");
    }

    public RegUser(String name,
            char gender, String emailId, long phoneNo) {
        super(name, gender);
        this.emailId = emailId;
        this.phoneNo = phoneNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void viewFreeShows() {
        System.out.println(getName());
        // Available, accessible also

        // System.out.println(this.name);
        // Available, but not directly accessible

        System.out.println("Authenticated User");
        System.out.println("View Free Shows");
    }

    // Overrided Function
    public void advertisement() {
        System.out.println("Less Ads");
    }

    // This is not overriding
    public static void staticFun() {
        System.out.println("This is child's Static fun");
    }

}
