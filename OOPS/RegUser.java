public class RegUser extends User {
    private String emailId;
    private long phoneNo;

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
}
