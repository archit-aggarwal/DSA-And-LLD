public class Admin extends RegUser {
    private String adminId;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public void editShow() {
        System.out.println("Admin");
        System.out.println("Edit Shows");
    }
}
