public class SubscribedUser extends RegUser {
    private String plan;
    private String validity;

    public SubscribedUser() {
        super();
        System.out.println("Subscribed User Constructor");
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public void viewPaidShows() {
        System.out.println("Subscribed User");
        System.out.println("View Paid Shows");
    }
}
